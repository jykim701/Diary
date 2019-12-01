package com.example.rainbowdiary.Reading_mode_1;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

import com.example.rainbowdiary.R;

public class SamplePagerAdapter extends PagerAdapter{
    static final int NUM_VIEW = 2; //페이지 수
    LayoutInflater mInflater;

    public SamplePagerAdapter(Context context) {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public void destroyItem(View collection, int position, Object view) {
        ((ViewPager) collection).removeView((View) view);
    }

    @Override
    public void finishUpdate(View collection {
    }

    @Override
    public int getCount() {
        return NUM_VIEW;
    }

    @Override
    public Object instantiateItem(View collection, int position) {
        ViewPager pager = (ViewPager) collection;
        if (position == 0) {
            View view = mInflater.inflate(R.layout.diary_page1, pager, false);
            pager.addView(view, 0);
            return view;
        } else {
            View view = mInflater.inflate(R.layout.diary_page2.pager, false);
            pager.addView(view, 1);
            return view;
        }
    }

    @Override
    public boolean isViewFromObject(View view, Object object){
    return view == (View) object;
    }

    @Override
    public void restoreState(Parcelable parcel, ClassLoader classLoader) {
    }

    @Override
    public Parcelable saveState() {
        return null;
    }

    @Override
    public void startUpdate(View collection) {
    }

    //ViewPager에 타이틀을 넣는 부분(이후 날짜를 표시하는데 써도 좋을 듯 필요없으면 삭제하자)
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "page1 of diary";
        } else {
            return "page2 of diary";
        }
    }

}