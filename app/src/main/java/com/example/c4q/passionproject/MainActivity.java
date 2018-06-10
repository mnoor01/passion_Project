package com.example.c4q.passionproject;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.c4q.passionproject.MVPController.AlertDialogFragment;
import com.example.c4q.passionproject.MVPController.MyPagerAdapter;

/**
 * For maps simply look up implicit intent and pass in the address
 */
public class MainActivity extends AppCompatActivity {
    private MyPagerAdapter pagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
        alertDialogFragment.show(getFragmentManager(), "nevne");
        viewPager=findViewById(R.id.main_view_pager);
        tabLayout= findViewById(R.id.sliding_tabs);
        MyPagerAdapter myPagerAdapter= new MyPagerAdapter(getSupportFragmentManager(),this);
        viewPager.setAdapter(myPagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//        viewPager.setOffscreenPageLimit(3);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.elections_icon));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.congree_icon));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.info_icon));

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int currentPosition=tab.getPosition();
                viewPager.setCurrentItem(tab.getPosition());
                switch (currentPosition){
                    case 0:
                        setActionBarTitle("election");
                        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.elections_icon));
                        break;
                    case 1:
                        setActionBarTitle("localRep");
                        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.congree_icon));
                        break;
                    case 2:
                        setActionBarTitle("Polling sites");
                        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.info_icon));
                        break;

                }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
}
//pulling