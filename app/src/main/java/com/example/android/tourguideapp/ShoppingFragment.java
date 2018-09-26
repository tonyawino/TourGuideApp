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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }

    //Display list of shopping centers
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.drawable.maasai_market_nairobi, getString(R.string.maasai_market_name), getString(R.string.maasai_market_location), getString(R.string.maasai_market_opening), getString(R.string.maasai_market_closing), getString(R.string.maasain_market_contact), getString(R.string.maasai_market_about)));
        attractions.add(new Attraction(R.drawable.city_market, getString(R.string.city_market_name), getString(R.string.city_market_location), getString(R.string.city_market_opening), getString(R.string.city_market_closing), getString(R.string.city_market_contact), getString(R.string.city_market_about)));
        attractions.add(new Attraction(R.drawable.hub, getString(R.string.hub_name), getString(R.string.hub_location), getString(R.string.hub_opening), getString(R.string.hub_closing), getString(R.string.hub_contact), getString(R.string.hub_about)));
        attractions.add(new Attraction(R.drawable.village_market, getString(R.string.village_market_name), getString(R.string.village_market_location), getString(R.string.village_market_opening), getString(R.string.village_market_closing), getString(R.string.village_market_contact), getString(R.string.village_market_about)));
        attractions.add(new Attraction(R.drawable.galleria, getString(R.string.galleria_name), getString(R.string.galleria_location), getString(R.string.galleria_opening), getString(R.string.galleria_closing), getString(R.string.galleria_contact), getString(R.string.galleria_about)));
        attractions.add(new Attraction(R.drawable.kazuri_beads, getString(R.string.kazuri_beads_name), getString(R.string.kazuri_beads_location), getString(R.string.kazuri_beads_opening), getString(R.string.kazuri_beads_closing), getString(R.string.kazuri_beads_contact), getString(R.string.kazuri_beads_about)));
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
