package com.example.user.sekety;

/**
 * Created by user on 4/30/2016.
 */
public class Coordinates {
    private double lat ;

    private double lon ;
    private String station;
    public  Coordinates(){}
public Coordinates(String station , double lat , double lon){
    this.lat = lat;
    this.lon = lon;
    this.station = station;
}

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }
}