package com.company;

import java.time.LocalTime;

public class ArrivedDestination extends Events{
    String DriverName;
    boolean isArrived;

    public ArrivedDestination(){

    }
    public ArrivedDestination(String name, LocalTime time, String driver_name) {
        super(name,time);
        this.DriverName = driver_name;
    }
    public boolean isArrivedDestination(boolean isArrived) {
        this.isArrived=isArrived;
        return this.isArrived;
    }
    public String getDriverName() {
        return DriverName;
    }

    @Override
    public void Notify_Admin() {
        obj.update_isArrivedDes(isArrived,eventName,getDriverName(),tripTime,pass_name);
    }









}
