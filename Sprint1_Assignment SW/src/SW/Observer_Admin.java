package com.company;

import java.time.LocalTime;

public interface Observer_Admin {
    //Passenger obj=new Passenger();
    public void update_Price(double price, String eventName, String driver_name, LocalTime time);
    public void update_isArrivedLoc(boolean arrived, String eventName, String driver_name, LocalTime time,String pass_name);
    public void update_isArrivedDes(boolean arrived, String eventName, String driver_name, LocalTime time,String pass_name);
    public void update_isAccept(boolean accept, String eventName, String pass_name, LocalTime time);
}
