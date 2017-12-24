package com.example.android.tourguideapp;

/**
 * Created by bander on 12/23/2017.
 */

public class Tour {

    /** String resource ID for the tour place of the city */
    private int mTourPlaceId;

    /** String resource ID for the description of the place */
    private int mPlaceDescriptionId;

    /** Image resource ID for the tour */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this tour */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new tour object.
     *
     * @param tourPlaceId is the string resource ID for the tour place of the city
     * @param placeDescriptionId is the string resource Id for the place description of the city
     * @param imageResourceId is the drawable resource ID for the image associated with the tour
     */
    public Tour(int tourPlaceId, int placeDescriptionId, int imageResourceId){
        mTourPlaceId = tourPlaceId;
        mPlaceDescriptionId = placeDescriptionId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the String resource ID for the tour place of the city.
     */
    public int getTourPlaceId() {
        return mTourPlaceId;
    }

    /**
     * Get the String resource ID for the place description of the city.
     */
    public int getPlaceDescriptionId() {
        return mPlaceDescriptionId;
    }

    /**
     * Return the image resource ID of the tour.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
