package com.company;

import java.util.ArrayList;

public class Driver implements Driver_Observer{
    private ArrayList<String> favAreas=new ArrayList<>();
    private ArrayList<String> srcAreaList=new ArrayList<>();
    Data obj=new Database();

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


    @Override
    public void Update_Driver(String srcArea) {
        System.out.println(getSrcAreaList());
        for (int i=0;i<getSrcAreaList().size();i++){
                System.out.println("There are an source area matched with your FAV. areas entered by the passengers: "+getSrcAreaList().get(i));
        }
    }

}
