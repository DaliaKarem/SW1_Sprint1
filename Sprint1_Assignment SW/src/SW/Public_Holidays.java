package com.company;

import java.text.DateFormat;
import java.time.LocalTime;

public class Public_Holidays extends Discounts{
    Data obj=new Database();

    public Public_Holidays(){

    }
    public boolean isPublic_Holidays(String time){
        boolean status=false;
        for (int i=0;i<obj.getPublicHolidays().size();i++){
            if(obj.getPublicHolidays().get(i)==time){
                status=true;
                setPrice(obj2.getPrice()+(0.05*obj2.getPrice()));
                break;
            }
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
