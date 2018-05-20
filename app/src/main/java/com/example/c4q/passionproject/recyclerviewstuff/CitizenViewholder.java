package com.example.c4q.passionproject.recyclerviewstuff;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.c4q.passionproject.R;
import com.example.c4q.passionproject.models.voterinfo.PollingLocationsItem;

public class CitizenViewholder extends RecyclerView.ViewHolder {
    private TextView addressName;
    private TextView addressLine1;
    private TextView addressLine2;
    private TextView addressLine3;
    private TextView addresscity;
    private TextView addressstate;
    private TextView addressZip;



    public CitizenViewholder(View itemView) {
        super(itemView);
        addressName=itemView.findViewById(R.id.addressName);
        addressLine1=itemView.findViewById(R.id.addressLine1);
        addressLine2=itemView.findViewById(R.id.addressLine2);
        addressLine3=itemView.findViewById(R.id.addressLine3);
        addresscity=itemView.findViewById(R.id.addressCity);
        addressstate=itemView.findViewById(R.id.addressState);
        addressZip=itemView.findViewById(R.id.addressZip);


    }
    public void onBind(PollingLocationsItem locationsItem){
        addressName.setText(locationsItem.getAddress().getLocationName());
        addressLine1.setText(locationsItem.getAddress().getLine1());
        addressLine2.setText(locationsItem.getAddress().getLine2());
        addressLine3.setText(locationsItem.getAddress().getLine3());
        addresscity.setText(locationsItem.getAddress().getCity());
        addressstate.setText(locationsItem.getAddress().getState());
        addressZip.setText(locationsItem.getAddress().getZip());



    }
}
