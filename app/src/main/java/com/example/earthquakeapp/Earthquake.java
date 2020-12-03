package com.example.earthquakeapp;

public class Earthquake {
    private double mMagnitude;
    private String mPlace;
    private Long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double magnitude, String place, Long timeInMilliseconds, String url){
        mMagnitude = magnitude;
        mPlace = place;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mPlace;
    }

    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl(){ return mUrl; }

}
