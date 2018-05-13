package com.example.c4q.passionproject.MVPController;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.passionproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ElectionFragment extends Fragment {
    private int[] image_resources={R.layout.fragment_election,R.layout.fragment_local_rep};
    private Context context;
    private  LayoutInflater layoutInflater;




    public ElectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_election, container, false);
    }

}
