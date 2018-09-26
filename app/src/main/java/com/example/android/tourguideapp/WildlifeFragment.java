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
public class WildlifeFragment extends Fragment {


    public WildlifeFragment() {
        // Required empty public constructor
    }

    //Display list of wildlife centers
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.drawable.stedmak, getString(R.string.stedmak_name), getString(R.string.stedmak_location), getString(R.string.stedmak_opening), getString(R.string.stedmak_closing), getString(R.string.stedmak_contact), getString(R.string.stedmak_about)));
        attractions.add(new Attraction(R.drawable.nairobi_national_park, getString(R.string.nairobi_national_park_name), getString(R.string.nairobi_national_park_location), getString(R.string.nairobi_national_park_opening), getString(R.string.nairobi_national_park_closing), getString(R.string.nairobi_national_park_contact), getString(R.string.nairobi_national_park_about)));
        attractions.add(new Attraction(R.drawable.nairobi_safari_walk, getString(R.string.nairobi_safari_walk_name), getString(R.string.nairobi_safari_walk_location), getString(R.string.nairobi_safari_walk_opening), getString(R.string.nairobi_safari_walk_closing), getString(R.string.nairobi_safari_walk_contact), getString(R.string.nairobi_safari_walk_about)));
        attractions.add(new Attraction(R.drawable.animal_orphanage, getString(R.string.animal_orphanage_name), getString(R.string.animal_orphanage_location), getString(R.string.animal_orphanage_opening), getString(R.string.animal_orphanage_closing), getString(R.string.animal_orphanage_contact), getString(R.string.animal_orphanage_about)));
        attractions.add(new Attraction(R.drawable.giraffe_center, getString(R.string.giraffe_center_name), getString(R.string.giraffe_center_location), getString(R.string.giraffe_center_opening), getString(R.string.giraffe_center_closing), getString(R.string.giraffe_center_contact), getString(R.string.giraffe_center_about)));
        attractions.add(new Attraction(R.drawable.david_sheldrick, getString(R.string.david_sheldrick_name), getString(R.string.david_sheldrick_location), getString(R.string.david_sheldrick_opening), getString(R.string.david_sheldrick_closing), getString(R.string.david_sheldrick_contact), getString(R.string.david_sheldrick_about)));
        attractions.add(new Attraction(R.drawable.oloolua, getString(R.string.oloolua_name), getString(R.string.oloolua_location), getString(R.string.oloolua_opening), getString(R.string.oloolua_closing), getString(R.string.oloolua_contact), getString(R.string.oloolua_about)));
        attractions.add(new Attraction(R.drawable.snake_park, getString(R.string.snake_park_name), getString(R.string.snake_park_location), getString(R.string.snake_park_opening), getString(R.string.snake_park_closing), getString(R.string.snake_park_contact), getString(R.string.snake_park_about)));
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
