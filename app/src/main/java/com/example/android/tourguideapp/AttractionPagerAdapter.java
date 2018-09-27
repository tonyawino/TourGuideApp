package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

//Manage the info and about fragments of an attraction
public class AttractionPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    public AttractionPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0)
            return new InfoFragment();
        else if (i == 1)
            return new AboutAttractionFragment();
        else
            return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return context.getString(R.string.attraction_pager_info);
        else if (position == 1)
            return context.getString(R.string.attraction_pager_about);
        else
            return super.getPageTitle(position);
    }
}
