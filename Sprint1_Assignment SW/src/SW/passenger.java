package com.company;

public class Passenger implements Observer{
    private String srcName;
    private String desName;
    Driver obj=new Driver();

    public Passenger(){

    }

    public void setDesName(String desName) {
        this.desName = desName;
    }
    public String getDesName(){
        return desName;
    }

    public void setSrcName(String srcName) {
        Driver obj=new Driver();
        if(obj.getFavAreas().contains(srcName)){
            obj.setSrcAreaList(srcName);
        }
        this.srcName = srcName;
    }
    public String getSrcName(){
        return srcName;
    }

    public void requestARide(String source,String destination){
        setSrcName(source);
        setDesName(destination);
    }

    @Override
    public void Notify_Driver() {
        obj.Update_Driver(getSrcName());
    }

    @Override
    public void update_Passenger(double offer) {
        System.out.println("The offer of this src area is: "+offer);
    }
}
