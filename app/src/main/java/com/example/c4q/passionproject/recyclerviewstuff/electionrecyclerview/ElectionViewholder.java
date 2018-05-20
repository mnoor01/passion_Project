package com.example.c4q.passionproject.recyclerviewstuff.electionrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.c4q.passionproject.R;
import com.example.c4q.passionproject.models.elections.ElectionsItem;

import org.w3c.dom.Text;

import javax.xml.transform.Templates;


class ElectionViewholder extends RecyclerView.ViewHolder {
    private TextView electionName;
    private TextView electionDay;
    private TextView electionId;
    public ElectionViewholder(View itemView) {
        super(itemView);
        electionName=itemView.findViewById(R.id.name);
        electionDay=itemView.findViewById(R.id.electionDay);
        electionId=itemView.findViewById(R.id.electionId);
    }
    public void onBind(ElectionsItem electionsItem){
        electionName.setText(electionsItem.getName());
        electionDay.setText(electionsItem.getElectionDay());
        electionId.setText(electionsItem.getId());
    }
}
