package com.company;

import java.time.LocalTime;

public abstract class Events {
    protected String eventName;
    protected LocalTime tripTime;
    protected String pass_name;
    protected Observer_Admin obj;

    public Events(){}
    public Events(String name, LocalTime time) {
        this.eventName=name;
        this.tripTime=time;
    }

    public void setPass_name(String pass_name) {
        this.pass_name = pass_name;
    }
    public String getPass_name() {
        return pass_name;
    }
    public void setEventName(String eventName){
        this.eventName=eventName;
    }
    public void setTripTime(LocalTime time){
        this.tripTime=time.now();
    }
    public String getEventName(){
        return eventName;
    }
    public LocalTime getTripTime(){
        return tripTime;
    }

    public abstract void Notify_Admin() ;


}
