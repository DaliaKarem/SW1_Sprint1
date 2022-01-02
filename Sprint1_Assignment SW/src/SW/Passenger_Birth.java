package com.company;

public class Passenger_Birth extends Discounts {
    RegisterAsPass obj;
    public Passenger_Birth(){}

    public boolean isPassenger_Birth(String date){
        boolean status=false;
        if(obj.getDOB()==date){
            setPrice(obj2.getPrice()+(0.01*obj2.getPrice()));
            status=true;
        }
        return status;
    }
    public void setPrice(double price){
        this.price=price;
    }
    @Override
    public double getPrice() {
        return this.price;
    }
}
