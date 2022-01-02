package com.company;

import java.time.LocalTime;

public class ArrivedLocation extends Events {
    String DriverName;
    boolean isArrived;

    public ArrivedLocation(){}
    public ArrivedLocation(String name, LocalTime time, String driver_name) {
        super(name,time);
        this.DriverName = driver_name;
    }
    public boolean isArrivedLocation(boolean isArrived) {
        this.isArrived=isArrived;
        return this.isArrived;
    }

    public String getDriverName() {
        return DriverName;
    }
    @Override
    public void Notify_Admin() {
        obj.update_isArrivedLoc(isArrived,eventName,getDriverName(),tripTime,pass_name);
    }














}
