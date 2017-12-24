package com.example.android.tourguideapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * {@link Fragment} that displays a list of Tour for Abha.
 */
public class AbhaFragment extends Fragment {

    public AbhaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        // Create a list of tour
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.abha_place_one, R.string.abha_description_one, R.drawable.abha_hill_climb));
        tours.add(new Tour(R.string.abha_place_two, R.string.abha_description_two, R.drawable.saudi_glow));
        tours.add(new Tour(R.string.abha_place_three, R.string.abha_description_three, R.drawable.cable_car));
        tours.add(new Tour(R.string.abha_place_four, R.string.abha_description_four, R.drawable.abha_palace_restaurant));
        tours.add(new Tour(R.string.abha_place_five, R.string.abha_description_five, R.drawable.fresh));

        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours, R.color.category_abha);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link tourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Tour} in the list.
        listView.setAdapter(tourAdapter);
        return rootView;
    }

}
