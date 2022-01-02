package com.company;

import java.time.LocalTime;

public class PutPrice extends Events{
    String DriverName;
    double price;

    public PutPrice(){}

    public PutPrice(String name, LocalTime time, String driver_name) {
        super(name,time);
        this.DriverName = driver_name;
    }
    public void putPrice(double price){
        this.price=price;
    }
    public  double getPrice(){
        return this.price;
    }

    public String getDriverName() {
        return DriverName;
    }
    @Override
    public void Notify_Admin() {
        obj.update_Price(price,eventName,getDriverName(),tripTime);
    }
}
