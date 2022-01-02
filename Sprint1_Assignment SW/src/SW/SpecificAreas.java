package com.company;

import java.util.ArrayList;

public class SpecificAreas extends Discounts{
    ArrayList<String> SpecificAreas=new ArrayList<>();
    boolean status;
    public SpecificAreas(){
        status=false;
    }

    public void setSpecificAreas(String specificAreas) {
        SpecificAreas.add(specificAreas);
    }
    public ArrayList<String> getSpecificAreas() {
        return SpecificAreas;
    }
    public boolean is_SpecificArea(String area) {

        for (int i = 0; i < getSpecificAreas().size(); i++) {
            if (area == getSpecificAreas().get(i)) {
                status = true;
                setPrice(obj2.getPrice()+(0.01*obj2.getPrice()));
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
