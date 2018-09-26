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
public class LandmarkFragment extends Fragment {


    public LandmarkFragment() {
        // Required empty public constructor
    }

    //Display list of landmarks
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.drawable.all_saints, getString(R.string.all_saints_name), getString(R.string.all_saints_location), getString(R.string.all_saints_opening), getString(R.string.all_saints_closing), getString(R.string.all_saints_contact), getString(R.string.all_saints_about)));
        attractions.add(new Attraction(R.drawable.tom_mboya_statue, getString(R.string.tom_mboya_name), getString(R.string.tom_mboya_location), getString(R.string.tom_mboya_opening), getString(R.string.tom_mboya_closing), "", getString(R.string.tom_mboya_about)));
        attractions.add(new Attraction(R.drawable.mcmillan, getString(R.string.mcmillan_name), getString(R.string.mcmillan_location), getString(R.string.mcmillan_opening), getString(R.string.mcmillan_closing), "", getString(R.string.mcmillan_about)));
        attractions.add(new Attraction(R.drawable.parliament, getString(R.string.parliament_name), getString(R.string.parliament_location), getString(R.string.parliament_opening), getString(R.string.parliament_closing), getString(R.string.parliament_contact), getString(R.string.parliament_about)));
        attractions.add(new Attraction(R.drawable.supreme_court, getString(R.string.supreme_court_name), getString(R.string.supreme_court_location), getString(R.string.supreme_court_opening), getString(R.string.supreme_court_closing), getString(R.string.supreme_court_contact), getString(R.string.supreme_court_about)));
        attractions.add(new Attraction(R.drawable.kicc, getString(R.string.kicc_name), getString(R.string.kicc_location), "", "", getString(R.string.kicc_contact), getString(R.string.kicc_about)));
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
