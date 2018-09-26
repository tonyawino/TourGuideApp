package com.example.android.tourguideapp;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

//Manage fragments in main activity
public class MyPagerAdapter extends FragmentStatePagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
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
            return "About";
        else if (i == 1)
            return "Landmarks";
        else if (i == 2)
            return "Museums&Art";
        else if (i == 3)
            return "Parks";
        else if (i == 4)
            return "Wildlife";
        else if (i == 5)
            return "Restaurants";
        else if (i == 6)
            return "Hotels";
        else if (i == 7)
            return "Shopping";
        else
            return null;
    }
}
