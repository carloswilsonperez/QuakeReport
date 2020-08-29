package com.example.android.quakereport;

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private String mDate;

    /**
     * Constructs a new {@Link Earthquake} object.
     * @param magnitude is the magnitude of the earthquake
     * @param location is the city location of the earthquake
     * @param date is the date the earthquake happened
     */
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public String getMagnitude () {
        return mMagnitude;
    }

    public String getLocation () {
        return mLocation;
    }

    public String getDate () {
        return mDate;
    }
}
