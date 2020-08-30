package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private Long mTimeInMilliseconds;

    /**
     * Constructs a new {@Link Earthquake} object.
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param time is the date the earthquake happened, in milliseconds
     */
    public Earthquake(double magnitude, String location, long time) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = time;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation () {
        return mLocation;
    }

    public Long getTimeInMilliseconds () {
        return mTimeInMilliseconds;
    }
}
