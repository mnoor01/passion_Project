package com.example.c4q.passionproject.MVPController;


import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.c4q.passionproject.R;
import com.example.c4q.passionproject.call.LocalCall;
import com.example.c4q.passionproject.constants.ApiKey;
import com.example.c4q.passionproject.database.AppDatabase;
import com.example.c4q.passionproject.models.elections.ElectionResponse;
import com.example.c4q.passionproject.models.elections.ElectionsItem;
import com.example.c4q.passionproject.recyclerviewstuff.electionrecyclerview.ElectionAdapter;

import java.util.ArrayList;
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
public class ElectionFragment extends Fragment {
    private int[] image_resources = {R.layout.fragment_election, R.layout.fragment_local_rep};
    private Context context;
    private View rootView;
    private EditText address;
    private EditText electionDay;
    private EditText electionId;
    List<ElectionsItem> electionsItemList;
    private Button submitButton;


    public ElectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_election, container, false);
        address=rootView.findViewById(R.id.addressinputElection);
        electionId=rootView.findViewById(R.id.electionIdElection);
        submitButton=rootView.findViewById(R.id.submitButtonElection);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (address!= null&&electionId!=null) {
                    setUpRetro(ApiKey.API_KEY, address.getText().toString(), Integer.parseInt(electionId.getText().toString()));
                }
                else {
                    Toast.makeText(rootView.getContext(),"invalid input",Toast.LENGTH_LONG).show();

                }
            }
        });
        ;


        // Inflate the layout for this fragment
        return rootView;
    }

    public void setUpRetro(String key, String address, int id){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://www.googleapis.com/civicinfo/v2/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        LocalCall service = retrofit.create(LocalCall.class);
        Call<ElectionResponse> electionCall=service.getElection(key,address,id);
        electionCall.enqueue(new Callback<ElectionResponse>() {
            @Override
            public void onResponse(Call<ElectionResponse> call, Response<ElectionResponse> response) {
                if (response.isSuccessful()) {
                    electionsItemList = response.body().getElections();
                    RecyclerView recyclerView = rootView.findViewById(R.id.electionRv);
                    ElectionAdapter adapter = new ElectionAdapter(electionsItemList);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(rootView.getContext());
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            AppDatabase database= Room.databaseBuilder(rootView.getContext(),AppDatabase.class,"passionDb").fallbackToDestructiveMigration().build();
                            database.pollingDao().insertElectionItems(electionsItemList);
                            List<ElectionsItem> electionsItems=database.pollingDao().loadElections();
                            Log.d(TAG, "run:elections "+electionsItems.size());
                        }
                    }).start();


                }
                else {
                    Toast.makeText(getActivity(), "bad address", Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<ElectionResponse> call, Throwable t) {
                t.printStackTrace();

            }
        });

    }


}
