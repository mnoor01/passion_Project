package com.example.c4q.passionproject.recyclerviewstuff.localreprecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.passionproject.R;
import com.example.c4q.passionproject.models.representatives.OfficialsItem;

import java.util.ArrayList;
import java.util.List;

public class LocalRepAdapter extends RecyclerView.Adapter<LocalRepViewholder> {
    List<OfficialsItem> officialsItems= new ArrayList<>();

    public LocalRepAdapter(List<OfficialsItem> officialsItems) {
        this.officialsItems = officialsItems;
    }

    @NonNull
    @Override
    public LocalRepViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View childView= LayoutInflater.from(parent.getContext()).inflate(R.layout.local_rep_itemview, parent, false);
        return new LocalRepViewholder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull LocalRepViewholder holder, int position) {

            holder.onBind(officialsItems.get(position));



    }

    @Override
    public int getItemCount() {
        return officialsItems.size();
    }
}
