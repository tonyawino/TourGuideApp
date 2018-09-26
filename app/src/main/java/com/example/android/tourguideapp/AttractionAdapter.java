package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter {
    public AttractionAdapter(Context context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    //Display lists of attractions depending on their type
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }
        Attraction attraction = (Attraction) getItem(position);
        ImageView imageView = convertView.findViewById(R.id.image_item);
        TextView name = convertView.findViewById(R.id.text_item_name);
        TextView location = convertView.findViewById(R.id.text_item_location);
        imageView.setImageResource(attraction.getImage());
        name.setText(attraction.getName());
        location.setText(attraction.getLocation());
        return convertView;
    }
}
