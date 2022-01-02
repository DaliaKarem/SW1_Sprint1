package com.company;

public class Passenger implements Observer{
    private String srcName;
    private String desName;
    Driver obj=new Driver();
    Data obj2=new Database();
    Info obj3=new RegisterAsPass();
    int numPass;
    long Driver_Id;

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

    public void requestARide(String source,String destination,int num_pass,long Driver_ID){
        boolean stat=false;
        setSrcName(source);
        setDesName(destination);
        obj2.set_FirstRide(obj3.getUserName());
        numPass=num_pass;
        for (int i=0;i<obj2.getDriversUsingSystem().size();i++){
            if(obj2.getDriversUsingSystem().get(i).getNationalID()==Driver_ID) {
                this.Driver_Id = Driver_ID;
                if(obj2.getDriversHaveRide().contains(Driver_ID)){
                    System.out.println("this driver is not available now");
                }else {
                    obj2.setDriversHaveRide(Driver_ID);
                }
                stat = true;
                break;
            }
        }if(stat==false){
            System.out.println("This NationalID of the driver is wrong");
        }
    }

    public long getDriver_Id() {
        return Driver_Id;
    }

    public int getNumPass() {
        return numPass;
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
