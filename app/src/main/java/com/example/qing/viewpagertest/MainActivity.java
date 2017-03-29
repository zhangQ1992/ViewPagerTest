package com.example.qing.viewpagertest;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

    MyViewPagerAdapter myViewPagerAdapter;
    SecViewPagerAdapter mSecViewPagerAdapter;
    ViewPager mViewPager, mViewPager2;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myViewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.my_viewpager);
        mViewPager.setAdapter(myViewPagerAdapter);

        mSecViewPagerAdapter = new SecViewPagerAdapter(getSupportFragmentManager());
        mViewPager2 = (ViewPager) findViewById(R.id.my_viewpager1);
        mViewPager2.setAdapter(mSecViewPagerAdapter);
    }

}
