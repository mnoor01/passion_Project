package com.example.c4q.passionproject.MVPController;


import android.arch.persistence.room.Room;
import android.arch.persistence.room.migration.Migration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.c4q.passionproject.R;
import com.example.c4q.passionproject.constants.ApiKey;
import com.example.c4q.passionproject.database.AppDatabase;
import com.example.c4q.passionproject.models.voterinfo.PollingLocationsItem;
import com.example.c4q.passionproject.models.voterinfo.VoterResponse;
import com.example.c4q.passionproject.recyclerviewstuff.CitizenAdapter;
import com.example.c4q.passionproject.call.LocalCall;

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
public class VoterInfoFragment extends Fragment {
    private View rootView;
    private EditText addressInput;
    private EditText stateInput;
    private EditText cityInput;
    private EditText eIdInput;
    private RecyclerView electionDay;
    private Button submitButton;
    private CitizenAdapter adapter;
    private List<PollingLocationsItem> pollingLocationsItems;

    public VoterInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_voter_info, container, false);
        addressInput = rootView.findViewById(R.id.addressinput);
        eIdInput = rootView.findViewById(R.id.electionId);
        submitButton = rootView.findViewById(R.id.submitButton);
        if (TextUtils.isEmpty(addressInput.getText())||TextUtils.isEmpty(eIdInput.getText())){
            Toast.makeText(rootView.getContext(),"invalid input",Toast.LENGTH_LONG).show();
        }
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setUpRetro(ApiKey.API_KEY, addressInput.getText().toString(), Integer.parseInt(eIdInput.getText().toString()));
            }
        });
        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    public void setUpRetro(String key, String address, int id) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://www.googleapis.com/civicinfo/v2/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        LocalCall service = retrofit.create(LocalCall.class);
        Call<VoterResponse> voterInfo = service.getVoterInfo(key, address, id);
        Log.d(TAG, "setUpRetro: " + voterInfo.request());
        voterInfo.enqueue(new Callback<VoterResponse>() {
            @Override
            public void onResponse(Call<VoterResponse> call, Response<VoterResponse> response) {
//                final List<PollingLocationsItem> pollingLocationsItems;

                if (response.isSuccessful()) {

                    pollingLocationsItems = response.body().getPollingLocations();
                    RecyclerView recyclerView = rootView.findViewById(R.id.electionDay);
                    adapter = new CitizenAdapter(pollingLocationsItems);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(rootView.getContext());
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(linearLayoutManager);


                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            AppDatabase db = Room.databaseBuilder(rootView.getContext(), AppDatabase.class, "PassionDb").fallbackToDestructiveMigration().build();
                            db.pollingDao().insertPollingLocationSites(pollingLocationsItems);
                            List<PollingLocationsItem> locationsItems = db.pollingDao().loadAll();
                            Log.d(TAG, "run:Reps " + locationsItems.size());

                        }
                    }).start();

                }
                else {
                    Toast.makeText(getActivity(), "bad address", Toast.LENGTH_LONG).show();
                }


            }

            @Override
            public void onFailure(Call<VoterResponse> call, Throwable t) {
                t.printStackTrace();

            }
        });


    }




}
