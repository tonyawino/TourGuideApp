package com.example.android.tourguideapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {


    public InfoFragment() {
        // Required empty public constructor
    }

    //Return info fragment
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final Attraction attraction = (Attraction) getActivity().getIntent().getSerializableExtra("attraction");
        //Open location on maps when name or location is clicked
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("geo:0,0?q=" + Uri.encode(attraction.getName() + " " + attraction.getLocation()));
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getActivity().getPackageManager()) != null)
                    startActivity(intent);
            }
        };
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        ImageView imageView = view.findViewById(R.id.image_info);
        TextView name = view.findViewById(R.id.text_info_name);
        TextView contact = view.findViewById(R.id.text_info_contact);
        TextView location = view.findViewById(R.id.text_info_location);
        TextView opening = view.findViewById(R.id.text_info_opening);
        TextView closing = view.findViewById(R.id.text_info_closing);
        TextView hyphen = view.findViewById(R.id.text_info_time_hyphen);
        LinearLayout container_contact = view.findViewById(R.id.container_contact);
        imageView.setImageResource(attraction.getImage());
        name.setText(attraction.getName());
        //Do not display contact if no contact is available
        if (attraction.getContact() == "") {
            container_contact.setVisibility(View.GONE);
        } else {
            container_contact.setVisibility(View.VISIBLE);
            contact.setText(attraction.getContact());
        }
        location.setText(attraction.getLocation());
        //Display "24 hours" if open for 24 hours
        if (attraction.getOpening() == attraction.getClosing()) {
            opening.setText("Open 24 hours");
            hyphen.setVisibility(View.GONE);
            closing.setVisibility(View.GONE);
        } else {
            hyphen.setVisibility(View.VISIBLE);
            closing.setVisibility(View.VISIBLE);
            opening.setText(attraction.getOpening());
            closing.setText(attraction.getClosing());
        }
        name.setOnClickListener(clickListener);
        location.setOnClickListener(clickListener);
        return view;
    }

}
