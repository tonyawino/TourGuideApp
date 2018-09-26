package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutAttractionFragment extends Fragment {


    public AboutAttractionFragment() {
        // Required empty public constructor
    }

    //Display info about the various attractions
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Attraction attraction = (Attraction) getActivity().getIntent().getSerializableExtra("attraction");
        View view = inflater.inflate(R.layout.fragment_about_attraction, container, false);
        TextView about = view.findViewById(R.id.text_about);
        about.setText(attraction.getAbout());
        return view;
    }

}
