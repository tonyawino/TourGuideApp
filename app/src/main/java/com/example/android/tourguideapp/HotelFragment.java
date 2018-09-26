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
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }

    //Return a list of hotels
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.drawable.stedmak, getString(R.string.stedmak_name), getString(R.string.stedmak_location), getString(R.string.stedmak_opening), getString(R.string.stedmak_closing), getString(R.string.stedmak_contact), getString(R.string.stedmak_about)));
        attractions.add(new Attraction(R.drawable.hilton, getString(R.string.hilton_name), getString(R.string.hilton_location), getString(R.string.hilton_opening), getString(R.string.hilton_closing), getString(R.string.hilton_contact), getString(R.string.hilton_about)));
        attractions.add(new Attraction(R.drawable.sarova_stanley, getString(R.string.sarova_stanley_name), getString(R.string.sarova_stanley_location), getString(R.string.sarova_stanley_opening), getString(R.string.sarova_stanley_closing), getString(R.string.sarova_stanley_contact), getString(R.string.sarova_stanley_about)));
        attractions.add(new Attraction(R.drawable.norfolk, getString(R.string.norfolk_name), getString(R.string.norfolk_location), getString(R.string.norfolk_opening), getString(R.string.norfolk_closing), getString(R.string.norfolk_contact), getString(R.string.norfolk_about)));
        attractions.add(new Attraction(R.drawable.laico, getString(R.string.laico_name), getString(R.string.laico_location), getString(R.string.laico_opening), getString(R.string.laico_closig), getString(R.string.laico_contact), getString(R.string.laico_about)));
        attractions.add(new Attraction(R.drawable.serena, getString(R.string.serena_name), getString(R.string.serena_location), getString(R.string.serena_opening), getString(R.string.serena_closing), getString(R.string.serena_contact), getString(R.string.serena_about)));
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
