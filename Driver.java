package com.company;

import java.util.ArrayList;

public class Driver {
    private ArrayList<String> favAreas=new ArrayList<>();
    private ArrayList<String> srcAreaList=new ArrayList<>();


    public Driver(){

    }

    public void setFavAreas(String favArea) {
        this.favAreas.add(favArea);
    }

    public ArrayList<String> getFavAreas() {
        System.out.println(favAreas);
        return favAreas;
    }
    public ArrayList<String> getfavAreas() {
        return favAreas;
    }

    public ArrayList<String> getSrcAreaList() {
        System.out.println(srcAreaList);
        return srcAreaList;
    }

    public void setSrcAreaList(String srcAreaList) {
        this.srcAreaList.add(srcAreaList);
    }
}
