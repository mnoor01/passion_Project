package com.example.c4q.passionproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.example.c4q.passionproject.MVPController.AlertDialogFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialogFragment alertDialogFragment= new AlertDialogFragment();
        alertDialogFragment.show(getFragmentManager(),"nevne");


    }
}
