package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Database {
    ArrayList<RegisterAsPass> passUsingSystem=new ArrayList<>();
    ArrayList<RegisterAsDriver>driversUsingSystem=new ArrayList<>();
    ArrayList<RegisterAsDriver>pending_drivers= new ArrayList<RegisterAsDriver>();
    ArrayList<String>suspendingAccounts= new ArrayList<String>();

    public void setPassUsingSystem(RegisterAsPass obj){
        passUsingSystem.add(obj);
    }

    public void setPending_drivers(RegisterAsDriver obj) {
        this.pending_drivers.add(obj);
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
        System.out.println(passUsingSystem);
        return passUsingSystem;
    }
}
