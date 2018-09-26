package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class AttractionActivity extends AppCompatActivity {

    //Display info and about of selected attraction
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Attraction attraction = (Attraction) getIntent().getSerializableExtra("attraction");
        setTitle(attraction.getName());
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new InfoFragment()).commit();
        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new AttractionPagerAdapter(getSupportFragmentManager()));
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
