package com.example.rainbowdiary.Reading_mode_1;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.rainbowdiary.R;

public class Flipping_pages extends Activity {
    ViewPager mViewPager;
    PagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipping_pages);

        mViewPager = (ViewPager) findViewById(R.id.view_diary1);
        mAdapter = new SamplePagerAdapter(this);
        mViewPager.setAdapter(mAdapter);
    }
}