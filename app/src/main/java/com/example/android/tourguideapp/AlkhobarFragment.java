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
 * {@link Fragment} that displays a list of Tour for Alkhobar.
 */
public class AlkhobarFragment extends Fragment {


    public AlkhobarFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        // Create a list of tour
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.alkhobar_place_one, R.string.alkhobar_description_one, R.drawable.hollywood));
        tours.add(new Tour(R.string.alkhobar_place_two, R.string.alkhobar_description_two, R.drawable.scitech_technology_center));
        tours.add(new Tour(R.string.alkhobar_place_three, R.string.alkhobar_description_three, R.drawable.half_moon_beach));
        tours.add(new Tour(R.string.alkhobar_place_four, R.string.alkhobar_description_four, R.drawable.alsanbok));
        tours.add(new Tour(R.string.alkhobar_place_five, R.string.alkhobar_description_five, R.drawable.primavera));

        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours, R.color.category_alkhobar);
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
