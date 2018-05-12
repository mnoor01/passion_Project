package com.example.c4q.passionproject.mvpcontroller;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import com.example.c4q.passionproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LocalRepFragment extends Fragment {


    public LocalRepFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_local_rep, container, false);
    }

}
