package com.company;

public class FirstRide extends Discounts {
    Data obj=new Database();
    public FirstRide(){

    }
    public boolean isFirstRide(String username){
        boolean status=false;
        for (int i=0;i<obj.get_FirstRide().size();i++){
            if(username==obj.get_FirstRide().get(i)){
                status=true;
                setPrice(obj2.getPrice()+(0.01*obj2.getPrice()));
                break;
            }
        }
        return  status;
    }



    public void setPrice(double price){
        this.price=price;
    }
    @Override
    public double getPrice() {
        return this.price;
    }
}
