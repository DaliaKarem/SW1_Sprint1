package com.company;

public class Two_Passengers extends Discounts {

    public Two_Passengers(){}

    public boolean is_Contains2(Passenger obj){
        boolean status=false;
        if (obj.getNumPass()==2){
            setPrice(obj2.getPrice()+(0.05*obj2.getPrice()));
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
