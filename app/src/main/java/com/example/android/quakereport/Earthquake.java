package com.example.android.quakereport;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private  long mTimeInMilliseconds;
    private String mURL;

    public Earthquake(double magnitude, String location, long timeInMilliseconds,String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mURL = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getURL(){return mURL;}
}
