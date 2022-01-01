package com.company;

import java.util.ArrayList;

public class Database implements Data {

    public void setPassUsingSystem(RegisterAsPass obj){
        passUsingSystem.add(obj);
    }

    public void setAllRatings(int rate){
        ratingDriver.add(rate);
    }
    public ArrayList<Integer> getRatings(){
        return ratingDriver;
    }

    @Override
    public ArrayList<RateDriver> getAllRatingsOfDriver() {
        return AllRatingsOfDriver;
    }

    @Override
    public void setAllRatingsOfDriver(RateDriver obj) {
        AllRatingsOfDriver.add(obj);
    }

    public void setPending_drivers(RegisterAsDriver obj) {
        pending_drivers.add(obj);
    }

    public void setSuspendingAccounts(String account_username) {
        suspendingAccounts.add(account_username);
    }

    public ArrayList<String> getSuspendingAccounts() {
        return suspendingAccounts;
    }

    public void setDriversUsingSystem(RegisterAsDriver obj) {

        driversUsingSystem.add(obj);
    }

    public ArrayList<RegisterAsDriver> getDriversUsingSystem() {
        return driversUsingSystem;
    }

    public ArrayList<RegisterAsDriver> getPending_drivers() {
        return pending_drivers;
    }

    public ArrayList<RegisterAsPass> getPassUsingSystem() {
        return passUsingSystem;
    }
}
