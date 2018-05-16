package com.example.c4q.passionproject.recyclerviewstuff;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.c4q.passionproject.R;
import com.example.c4q.passionproject.models.voterinfo.PollingLocationsItem;

public class CitizenViewholder extends RecyclerView.ViewHolder {
    private TextView addressView;
    private TextView electionDay;


    public CitizenViewholder(View itemView) {
        super(itemView);
        addressView=itemView.findViewById(R.id.address);
        electionDay=itemView.findViewById(R.id.electionDay);

    }
    public void onBind(PollingLocationsItem locationsItem){
        addressView.setText(locationsItem.getAddress().getLine1());
        addressView.setText(locationsItem.getAddress().getLine2());
        addressView.setText(locationsItem.getAddress().getLine3());
        addressView.setText(locationsItem.getAddress().getCity());
        addressView.setText(locationsItem.getAddress().getState());
        addressView.setText(locationsItem.getAddress().getLocationName());

    }
}
