package com.company;

/**
 * Created by gulezahra on 10/8/2016.
 */
public class Distance {
    public double distKilometer;
    public int distMeter;

    public Distance (double distKilometer, int distMeter) {
        this.distKilometer = distKilometer;
        this.distMeter = distMeter;
    }

    public String display () {
        String s = "Distance in Km : " + distKilometer + "\nDistance in m : " + distMeter;
        System.out.println(s);
        return s;
    }
}
