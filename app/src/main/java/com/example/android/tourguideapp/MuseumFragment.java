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
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }

    //Display list of museums
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(R.drawable.karen_blixen, getString(R.string.karen_blixen_name), getString(R.string.karen_blixen_location), getString(R.string.karen_blixen_opening), getString(R.string.karen_blixen_closing), getString(R.string.karen_blixen_contact), getString(R.string.karen_blixen_about)));
        attractions.add(new Attraction(R.drawable.bomas, getString(R.string.bomas_name), getString(R.string.bomas_location), getString(R.string.bomas_opening), getString(R.string.bomas_closing), getString(R.string.bomas_contact), getString(R.string.bomas_about)));
        attractions.add(new Attraction(R.drawable.museum, getString(R.string.museum_name), getString(R.string.museum_location), getString(R.string.museum_opening), getString(R.string.museum_closing), getString(R.string.museum_contact), getString(R.string.museum_about)));
        attractions.add(new Attraction(R.drawable.nairobi_gallery, getString(R.string.nairobi_gallery_name), getString(R.string.nairobi_gallery_location), getString(R.string.nairobi_gallery_opening), getString(R.string.nairobi_gallery_closing), getString(R.string.nairobi_gallery_contact), getString(R.string.nairobi_gallery_about)));
        attractions.add(new Attraction(R.drawable.godown, getString(R.string.godown_name), getString(R.string.godown_location), getString(R.string.godown_opening), getString(R.string.godown_closing), getString(R.string.godown_contact), getString(R.string.godown_about)));
        attractions.add(new Attraction(R.drawable.circle_art_gallery, getString(R.string.circle_art_gallery_name), getString(R.string.circle_art_gallery_location), getString(R.string.circle_art_gallery_opening), getString(R.string.circle_art_gallery_closing), getString(R.string.circle_art_gallery_contact), getString(R.string.circle_art_gallery_about)));
        attractions.add(new Attraction(R.drawable.kuona, getString(R.string.kuona_name), getString(R.string.kuona_location), getString(R.string.kuona_opening), getString(R.string.kuona_closing), getString(R.string.kuona_contact), getString(R.string.kuona_about)));
        attractions.add(new Attraction(R.drawable.african_heritage, getString(R.string.african_heritage_name), getString(R.string.african_heritage_location), getString(R.string.african_heritage_opening), getString(R.string.african_heritage_closing), getString(R.string.african_heritage_contact), getString(R.string.african_heritage_about)));
        attractions.add(new Attraction(R.drawable.railways_museum, getString(R.string.railways_museum_name), getString(R.string.railways_museum_location), getString(R.string.railways_museum_opening), getString(R.string.railways_museum_closing), getString(R.string.railways_museum_contact), getString(R.string.railways_museum_about)));
        attractions.add(new Attraction(R.drawable.august_7th, getString(R.string.peace_museum_name), getString(R.string.august_7th_location), "0900", "1800", getString(R.string.august_7th_contact), getString(R.string.peace_museum_about)));
        attractions.add(new Attraction(R.drawable.national_archives, getString(R.string.national_archives_name), getString(R.string.national_archives_location), getString(R.string.national_archives_opening), getString(R.string.national_archives_closing), getString(R.string.national_archives_contact), getString(R.string.national_archives_about)));
        attractions.add(new Attraction(R.drawable.judiciary_museum, getString(R.string.judiciary_museum_name), getString(R.string.supreme_court_location), getString(R.string.judiciary_museum_opening), getString(R.string.judiciary_museum_Closing), getString(R.string.judiciary_museum_contact), getString(R.string.judiciary_museum_about)));
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
