package com.example.c4q.passionproject.recyclerviewstuff.electionrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.passionproject.R;
import com.example.c4q.passionproject.models.elections.ElectionsItem;

import java.util.ArrayList;
import java.util.List;

public class ElectionAdapter extends RecyclerView.Adapter<ElectionViewholder> {
    private List<ElectionsItem> electionsItemList= new ArrayList<>();
    @NonNull
    @Override
    public ElectionViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.election_itemview, parent, false);
        return new ElectionViewholder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull ElectionViewholder holder, int position) {
        holder.onBind(electionsItemList.get(position));

    }

    @Override
    public int getItemCount() {
        return electionsItemList.size();
    }
}
