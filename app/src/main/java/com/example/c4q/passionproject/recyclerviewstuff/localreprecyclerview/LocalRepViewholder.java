package com.example.c4q.passionproject.recyclerviewstuff.localreprecyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.c4q.passionproject.R;
import com.example.c4q.passionproject.models.representatives.OfficialsItem;
import com.squareup.picasso.Picasso;

class LocalRepViewholder extends RecyclerView.ViewHolder {
    private TextView name;
    private ImageView photoUrl;
    private TextView addressLine1;
    private TextView addressLine2;
    private TextView localRepCity;
    private TextView localRepState;
    private TextView localRepZip;
    public LocalRepViewholder(View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.repName);
        photoUrl=itemView.findViewById(R.id.repPhoto);
        addressLine1=itemView.findViewById(R.id.addressRepLine1);
        addressLine2=itemView.findViewById(R.id.addressRepLine2);
        localRepCity=itemView.findViewById(R.id.addressRepCity);
        localRepState=itemView.findViewById(R.id.addressRepState);
        localRepZip=itemView.findViewById(R.id.addressRepZip);


    }
    private final String TAG = "LocalRepViewholder";
    public void onBind(OfficialsItem officialsItem){
           if (officialsItem.getAddress()!=null) {
               name.setText(officialsItem.getName());
               Picasso.with(itemView.getContext()).load(officialsItem.getPhotoUrl()).into(photoUrl);
               addressLine1.setText(officialsItem.getAddress().get(0).getLine1());
               addressLine2.setText(officialsItem.getAddress().get(0).getLine2());
               localRepState.setText(officialsItem.getAddress().get(0).getCity());
               localRepZip.setText(officialsItem.getAddress().get(0).getZip());
           }


    }
}
