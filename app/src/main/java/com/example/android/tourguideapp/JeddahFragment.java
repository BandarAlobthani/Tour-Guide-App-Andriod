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
 * {@link Fragment} that displays a list of Tour for Jeddah.
 */
public class JeddahFragment extends Fragment {

    public JeddahFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        // Create a list of tour
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.jeddah_place_one, R.string.jeddah_description_one, R.drawable.lcma));
        tours.add(new Tour(R.string.jeddah_place_two, R.string.jeddah_description_two, R.drawable.barney));
        tours.add(new Tour(R.string.jeddah_place_three, R.string.jeddah_description_three, R.drawable.theeuropean));
        tours.add(new Tour(R.string.jeddah_place_four, R.string.jeddah_description_four, R.drawable.texas_roadhouse));
        tours.add(new Tour(R.string.jeddah_place_five, R.string.jeddah_description_five, R.drawable.al_baik));
        tours.add(new Tour(R.string.jeddah_place_six, R.string.jeddah_description_six, R.drawable.ihop));
        tours.add(new Tour(R.string.jeddah_place_seven, R.string.jeddah_description_seven, R.drawable.jeddah_cornish));
        tours.add(new Tour(R.string.jeddah_place_eight, R.string.jeddah_description_eight, R.drawable.king_fountain));
        tours.add(new Tour(R.string.jeddah_place_nine, R.string.jeddah_description_nine, R.drawable.red_sea_mall));
        tours.add(new Tour(R.string.jeddah_place_ten, R.string.jeddah_description_ten, R.drawable.balad));

        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours, R.color.category_jeddah);
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
