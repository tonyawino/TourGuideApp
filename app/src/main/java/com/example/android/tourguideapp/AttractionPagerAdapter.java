package com.example.android.tourguideapp;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

//Manage the info and about fragments of an attraction
public class AttractionPagerAdapter extends FragmentPagerAdapter {
    public AttractionPagerAdapter(FragmentManager fm) {
        super(fm);
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
            return "Info";
        else if (position == 1)
            return "About";
        else
            return super.getPageTitle(position);
    }
}
