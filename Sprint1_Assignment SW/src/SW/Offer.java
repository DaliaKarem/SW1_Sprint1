package com.company;

public class Offer implements Price_Offer{
    public double offer = 0;
    Passenger obj=new Passenger();

    @Override
    public void notify_Passenger() {
        obj.update_Passenger(offer);
    }
    @Override
    public void setPrice(double price) {
        this.offer=price;
    }
}

