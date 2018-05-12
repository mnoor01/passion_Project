package com.example.c4q.passionproject;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.c4q.passionproject.mvpcontroller.AlertDialogFragment;
import com.example.c4q.passionproject.mvpcontroller.MyPagerAdapter;

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
        MyPagerAdapter myPagerAdapter= new MyPagerAdapter(getSupportFragmentManager(),this);
        viewPager.setAdapter(myPagerAdapter);
        tabLayout= findViewById(R.id.sliding_tabs);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        viewPager.setOffscreenPageLimit(2);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_home_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_launcher_foreground));
//        tabLayout.addTab();
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int currentPosition=tab.getPosition();
                viewPager.setCurrentItem(tab.getPosition());
                switch (currentPosition){
                    case 0:
                        setActionBarTitle("election");
                        break;
                    case 1:
                        setActionBarTitle("localRep");
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
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.ic_home_black_24dp));
    }
}
