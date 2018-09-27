package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

//Manage fragments in main activity
public class MyPagerAdapter extends FragmentStatePagerAdapter {
    private Context context;
    public MyPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0)
            return new AboutFragment();
        else if (i == 1)
            return new LandmarkFragment();
        else if (i == 2)
            return new MuseumFragment();
        else if (i == 3)
            return new ParkFragment();
        else if (i == 4)
            return new WildlifeFragment();
        else if (i == 5)
            return new RestaurantFragment();
        else if (i == 6)
            return new HotelFragment();
        else if (i == 7)
            return new ShoppingFragment();
        else
            return null;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int i) {
        if (i == 0)
            return context.getString(R.string.main_about);
        else if (i == 1)
            return context.getString(R.string.main_landmarks);
        else if (i == 2)
            return context.getString(R.string.main_museums);
        else if (i == 3)
            return context.getString(R.string.main_parks);
        else if (i == 4)
            return context.getString(R.string.main_wildlife);
        else if (i == 5)
            return context.getString(R.string.main_restaurants);
        else if (i == 6)
            return context.getString(R.string.main_hotels);
        else if (i == 7)
            return context.getString(R.string.main_shopping);
        else
            return null;
    }
}
