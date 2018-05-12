package com.example.c4q.passionproject.mvpcontroller;



import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.c4q.passionproject.R;
import com.example.c4q.passionproject.models.voterinfo.Election;
import com.example.c4q.passionproject.mvpcontroller.ElectionFragment;

/**
 * Created by c4q on 5/9/18.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    private static final String TAG = "adapter";
    private Context context;


    public MyPagerAdapter(FragmentManager fm,Context context) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                ElectionFragment electionFragment= new ElectionFragment();
                Log.d(TAG, "getItem: is working");
                return electionFragment;
            case 1:
                LocalRepFragment localRepFragment= new LocalRepFragment();
                return localRepFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getString(R.string.elections);
            case 1:
                return context.getString(R.string.local_representatives);

        }
        return null;
    }
}
