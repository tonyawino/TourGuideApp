package com.example.android.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParkFragment extends Fragment {


    public ParkFragment() {
        // Required empty public constructor
    }

    //Display list of parks
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.drawable.city_park, getString(R.string.city_park_name), getString(R.string.city_park_location), getString(R.string.city_park_opening), getString(R.string.city_park_closing), "", getString(R.string.city_park_about)));
        attractions.add(new Attraction(R.drawable.uhuru_gardens, getString(R.string.uhuru_gardens_name), getString(R.string.uhuru_gardens_location), getString(R.string.uhuru_gardens_opening), getString(R.string.uhuru_gardens_closing), getString(R.string.uhuru_gardens_contact), getString(R.string.uhuru_gardens_about)));
        attractions.add(new Attraction(R.drawable.arboretum, getString(R.string.arboretum_name), getString(R.string.arboretum_location), getString(R.string.arboretum_opening), getString(R.string.arboretum_closing), getString(R.string.arboretum_contact), getString(R.string.arboretum_about)));
        attractions.add(new Attraction(R.drawable.central_park, getString(R.string.central_park_name), getString(R.string.central_park_location), getString(R.string.central_park_opening), getString(R.string.central_park_closing), getString(R.string.central_park_contacts), getString(R.string.central_park_about)));
        attractions.add(new Attraction(R.drawable.jeevanjee, getString(R.string.jeevanjee_name), getString(R.string.jeevanjee_location), getString(R.string.jeevanjee_opening), getString(R.string.jeevanjee_closing), "", getString(R.string.jeevanjee_about)));
        attractions.add(new Attraction(R.drawable.uhuru_park, getString(R.string.uhuru_park_name), getString(R.string.uhuru_park_location), getString(R.string.uhuru_park_opening), getString(R.string.uhuru_park_closing), "", getString(R.string.uhuru_park_about)));
        attractions.add(new Attraction(R.drawable.august_7th, getString(R.string.august_7th_name), getString(R.string.august_7th_location), getString(R.string.august_7th_opening), getString(R.string.august_7th_closing), getString(R.string.august_7th_contact), getString(R.string.august_7th_about)));
        ListView list = view.findViewById(R.id.list);
        list.setAdapter(new AttractionAdapter(getActivity(), attractions));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Attraction attraction = (Attraction) adapterView.getAdapter().getItem(i);
                Intent intent = new Intent(getActivity(), AttractionActivity.class);
                intent.putExtra("attraction", attraction);
                startActivity(intent);
            }
        });
        return view;
    }

}
