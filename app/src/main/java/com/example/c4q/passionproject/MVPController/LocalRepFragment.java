package com.example.c4q.passionproject.MVPController;


import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.c4q.passionproject.R;
import com.example.c4q.passionproject.call.LocalCall;
import com.example.c4q.passionproject.constants.ApiKey;
import com.example.c4q.passionproject.database.AppDatabase;
import com.example.c4q.passionproject.models.representatives.OfficesItem;
import com.example.c4q.passionproject.models.representatives.OfficialsItem;
import com.example.c4q.passionproject.models.representatives.RepResponse;
import com.example.c4q.passionproject.recyclerviewstuff.localreprecyclerview.LocalRepAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.content.ContentValues.TAG;

/**
 * A simple {@link Fragment} subclass.
 */
public class LocalRepFragment extends Fragment {
    private View rootView;
    private EditText addressInput;
    private EditText electionIdLocalRep;
    private Button buttonLocalRep;
    private List<OfficialsItem> officialsItemList;


    public LocalRepFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_local_rep, container, false);
        addressInput=rootView.findViewById(R.id.addressinputLocalRep);
        electionIdLocalRep=rootView.findViewById(R.id.electionIdLocalRep);
        buttonLocalRep=rootView.findViewById(R.id.submitButtonLocalRep);
        buttonLocalRep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (addressInput!= null||electionIdLocalRep!=null) {
                    setUpRetroLocalRep(ApiKey.API_KEY, addressInput.getText().toString(), Integer.parseInt(electionIdLocalRep.getText().toString()));
                }
                else {
                    Toast.makeText(rootView.getContext(),"invalid input",Toast.LENGTH_LONG).show();

                }
            }
        });



        // Inflate the layout for this fragment
        return rootView;
    }
    public void setUpRetroLocalRep(String key, final String addressRep, int id){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://www.googleapis.com/civicinfo/v2/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        LocalCall service = retrofit.create(LocalCall.class);
        Call<RepResponse> localCall=service.getReps(key,addressRep,id);
        Log.d(TAG, "setUpRetroLocalRep: "+ localCall.request());
        localCall.enqueue(new Callback<RepResponse>() {
            @Override
            public void onResponse(Call<RepResponse> call, Response<RepResponse> response) {
                if (response.isSuccessful()) {
                    officialsItemList = response.body().getOfficials();
                    RecyclerView recyclerView = rootView.findViewById(R.id.localRepRv);
                    LocalRepAdapter adapter = new LocalRepAdapter(officialsItemList);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(rootView.getContext());
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setAdapter(adapter);
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            AppDatabase database= AppDatabase.getInstance(getContext());
                            database.pollingDao().insertLocalReps(officialsItemList);
                            List<OfficialsItem> officialsItems=database.pollingDao().loadReps();
                            Log.d(TAG, "run: local rep"+ officialsItems.size());
                        }
                    }).start();
                } else {
                    Toast.makeText(getActivity(), "bad address", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<RepResponse> call, Throwable t) {
                t.printStackTrace();

            }
        });

    }


}
