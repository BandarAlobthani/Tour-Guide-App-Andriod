package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bander on 12/23/2017.
 */

/**
        * {@link TourAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
        * based on a data source, which is a list of {@link Tour} objects.
        */
public class TourAdapter extends ArrayAdapter<Tour> {
    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link TourAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param tours is the list of {@link Tour}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of tours
     */
    public TourAdapter(Context context, ArrayList<Tour> tours, int colorResourceId) {
        super(context, 0, tours);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Tour} object located at this position in the list
        Tour tour = (Tour) getItem(position);
        // Find the TextView in the list_item.xml layout with the ID tour_place_text_view.
        TextView tourPlaceTextView = (TextView) listItemView.findViewById(R.id.tour_place_text_view);
        // Get the tour place from the tour object and set this text on
        // the tour place TextView.
        tourPlaceTextView.setText(tour.getTourPlaceId());

        // Find the TextView in the list_item.xml layout with the ID place_description_text_view.
        TextView placeDescriptionTextView = (TextView) listItemView.findViewById(R.id.place_description_text_view);
        // Get the Place Description from the tour object and set this text on
        // the place Description TextView.
        placeDescriptionTextView.setText(tour.getPlaceDescriptionId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // display the provided image based on the resource ID
        imageView.setImageResource(tour.getImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
