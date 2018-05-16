package com.example.c4q.passionproject.MVPController;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.c4q.passionproject.R;
import com.example.c4q.passionproject.constants.ApiKey;
import com.example.c4q.passionproject.models.voterinfo.PollingLocationsItem;
import com.example.c4q.passionproject.models.voterinfo.VoterResponse;
import com.example.c4q.passionproject.retrofitStuff.LocalCall;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class VoterInfoFragment extends Fragment {
    private View rootView;
    private EditText addressInput;
    private EditText stateInput;
    private EditText cityInput;
    private EditText eIdInput;
    private TextView electionDay;
    private Button submitButton;
    private List<PollingLocationsItem> pollingLocationsItems;


    public VoterInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_voter_info, container, false);
        addressInput=rootView.findViewById(R.id.addressinput);
        cityInput=rootView.findViewById(R.id.cityInput);
        stateInput=rootView.findViewById(R.id.stateInput);
        eIdInput=rootView.findViewById(R.id.electionId);
        electionDay=rootView.findViewById(R.id.electionDay);
        submitButton=rootView.findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setUpRetro(ApiKey.API_KEY,addressInput.getText().toString(),stateInput.getText().toString(),cityInput.getText().toString(),Integer.parseInt(eIdInput.getText().toString()));

            }
        });
        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    public void setUpRetro(String key, String address, String state, String city, int id){
        Retrofit retrofit= new Retrofit.Builder().baseUrl("https://www.googleapis.com/civicinfo/v2/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        LocalCall service= retrofit.create(LocalCall.class);
        Call<VoterResponse> voterInfo= service.getVoterInfo(ApiKey.API_KEY,address,state,city,id);
        voterInfo.enqueue(new Callback<VoterResponse>() {
            @Override
            public void onResponse(Call<VoterResponse> call, Response<VoterResponse> response) {
                pollingLocationsItems=response.body().getPollingLocations();

            }

            @Override
            public void onFailure(Call<VoterResponse> call, Throwable t) {
                t.printStackTrace();

            }
        });


    }


}
