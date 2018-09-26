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
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }

    //Display list of restaurants
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.drawable.stedmak, getString(R.string.stedmak_name), getString(R.string.stedmak_location), getString(R.string.stedmak_opening), getString(R.string.stedmak_closing), getString(R.string.stedmak_contact), getString(R.string.stedmak_about)));
        attractions.add(new Attraction(R.drawable.kosewe, getString(R.string.kosewe_nam), getString(R.string.kosewe_location), getString(R.string.kosewe_opening), getString(R.string.kosewe_closing), getString(R.string.kosewe_contact), getString(R.string.kosewe_about)));
        attractions.add(new Attraction(R.drawable.carnivore, getString(R.string.carnivore_name), getString(R.string.carnivore_location), getString(R.string.carnivore_opening), getString(R.string.carnivore_closing), getString(R.string.carnivore_contact), getString(R.string.carnivore_about)));
        attractions.add(new Attraction(R.drawable.fogo, getString(R.string.fogo_name), getString(R.string.fogo_location), getString(R.string.fogo_opening), getString(R.string.fogo_closing), getString(R.string.fogo_contact), getString(R.string.fogo_about)));
        attractions.add(new Attraction(R.drawable.cjs, getString(R.string.cjs_name), getString(R.string.cjs_location), getString(R.string.cjs_opening), getString(R.string.cjs_closing), getString(R.string.cjs_contact), getString(R.string.cjs_about)));
        attractions.add(new Attraction(R.drawable.kilimanjaro, getString(R.string.kilimanjaro_name), getString(R.string.kilimanjaro_location), getString(R.string.kilimanjaro_opening), getString(R.string.kilimanjaro_closing), getString(R.string.kilimanjaro_contact), getString(R.string.kilimanjaro_about)));
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
