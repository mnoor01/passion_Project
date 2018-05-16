package com.example.c4q.passionproject.recyclerviewstuff;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.passionproject.R;
import com.example.c4q.passionproject.models.elections.ElectionResponse;
import com.example.c4q.passionproject.models.voterinfo.PollingLocationsItem;

import java.util.ArrayList;
import java.util.List;

public class CitizenAdapter extends RecyclerView.Adapter<CitizenViewholder>{
    private List<PollingLocationsItem> pollingLocations;

    public CitizenAdapter(List<PollingLocationsItem> pollingLocations) {
        this.pollingLocations = pollingLocations;
    }

    @NonNull
    @Override
    public CitizenViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.voter_info_itemview, parent, false);
        return new CitizenViewholder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull CitizenViewholder holder, int position) {
        holder.onBind(pollingLocations.get(position));


    }

    @Override
    public int getItemCount() {
        return pollingLocations.size();
    }
}
