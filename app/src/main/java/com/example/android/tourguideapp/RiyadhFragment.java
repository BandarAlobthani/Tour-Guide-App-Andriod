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
 * {@link Fragment} that displays a list of Tour for Riyadh.
 */
public class RiyadhFragment extends Fragment {


    public RiyadhFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        // Create a list of tour
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.riyadh_place_one, R.string.riyadh_description_one, R.drawable.arda));
        tours.add(new Tour(R.string.riyadh_place_two, R.string.riyadh_description_two, R.drawable.romi));
        tours.add(new Tour(R.string.riyadh_place_three, R.string.riyadh_description_three, R.drawable.shadow));
        tours.add(new Tour(R.string.riyadh_place_four, R.string.riyadh_description_four, R.drawable.theglobal));
        tours.add(new Tour(R.string.riyadh_place_five, R.string.riyadh_description_five, R.drawable.cafeebateel));
        tours.add(new Tour(R.string.riyadh_place_six, R.string.riyadh_description_six, R.drawable.najad));
        tours.add(new Tour(R.string.riyadh_place_seven, R.string.riyadh_description_seven, R.drawable.national_museum));
        tours.add(new Tour(R.string.riyadh_place_eight, R.string.riyadh_description_eight, R.drawable.king_abdullah_park));
        tours.add(new Tour(R.string.riyadh_place_nine, R.string.riyadh_description_nine, R.drawable.kingdom_centre_tower));
        tours.add(new Tour(R.string.riyadh_place_ten, R.string.riyadh_description_ten, R.drawable.tahlia_street));

        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours, R.color.category_riyadh);
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
