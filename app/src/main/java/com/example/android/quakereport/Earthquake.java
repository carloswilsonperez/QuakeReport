package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private Long mTimeInMilliseconds;
    private String mUrl;

    /**
     * Constructs a new {@Link Earthquake} object.
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param time is the date the earthquake happened, in milliseconds
     * @param url is the url for the earthquake
     */
    public Earthquake(double magnitude, String location, long time, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = time;
        mUrl = url;
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

    public String getUrlForEarthquake () {
        return mUrl;
    }
}
