package com.example.c4q.passionproject.recyclerviewstuff;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.passionproject.models.elections.ElectionResponse;

public class CitizenAdapter extends RecyclerView.Adapter<CitizenViewholder>{
    private ElectionResponse electionResponse=new ElectionResponse();

    @NonNull
    @Override
    public CitizenViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CitizenViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
