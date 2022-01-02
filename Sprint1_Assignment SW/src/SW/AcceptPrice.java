package com.company;

import java.time.LocalTime;

public class AcceptPrice extends Events{
    String DriverName;
    boolean isAccepted;
    public AcceptPrice(){}



    public AcceptPrice(String name, LocalTime time, String driver_name) {
        super(name,time);
        this.DriverName = driver_name;
    }
    public boolean Accept_Price(boolean isAccepted) {
        this.isAccepted=isAccepted;
        return this.isAccepted;
    }
    public String getDriverName() {
        return DriverName;
    }
    @Override
    public void Notify_Admin() {
        obj.update_isAccept(this.isAccepted,eventName,pass_name,tripTime);
    }
}
