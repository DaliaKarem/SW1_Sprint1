package com.company;

public class Passenger {
    private String srcName;
    private String desName;

    public Passenger(){

    }

    public void setDesName(String desName) {
        this.desName = desName;
    }

    public void setSrcName(String srcName) {
        Driver obj=new Driver();
        if(obj.getFavAreas().contains(srcName)){
            obj.setSrcAreaList(srcName);
        }
        this.srcName = srcName;
    }

    public String getDesName() {
        return desName;
    }

    public String getSrcName() {
        return srcName;
    }
    public void requestARide(String source,String destination){
        Passenger obj=new Passenger();
        obj.setSrcName(source);
        obj.setDesName(destination);
    }
}
