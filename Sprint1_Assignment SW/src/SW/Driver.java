package com.company;

import java.util.ArrayList;

public class Driver implements Driver_Observer {
    private ArrayList<String> favAreas=new ArrayList<>();
    private ArrayList<String> srcAreaList=new ArrayList<>();
    private boolean isAvailable;
    Data obj3=new Database();
    int count=0;

    public Driver(){
    }

    public void setFavAreas(String favArea) {
        this.favAreas.add(favArea);
    }

    public ArrayList<String> getFavAreas() {
        return favAreas;
    }
    public ArrayList<String> getSrcAreaList() {
        return srcAreaList;
    }

    public void setSrcAreaList(String srcAreaList) {
        this.srcAreaList.add(srcAreaList);
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void getReq(ArrivedDestination obj,Passenger obj2){
        count++;
        obj=new ArrivedDestination();
        if(obj.isArrived==true){
            obj3.getDriversHaveRide().remove(obj2.getDriver_Id());
            setAvailable(true);
        }else {
            setAvailable(false);
        }
    }

    @Override
    public void Update_Driver(String srcArea) {
        if(count==1){
            if (getSrcAreaList().contains(srcArea)) {
                System.out.println("There are an source area matched with your FAV. areas entered by the passengers: " + srcArea);
            }
        }
        else if(isAvailable()) {
            if (getSrcAreaList().contains(srcArea)) {
                System.out.println("There are an source area matched with your FAV. areas entered by the passengers: " + srcArea);
            }
        }
    }


}
