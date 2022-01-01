package com.company;

import java.util.ArrayList;

public interface Data {
    ArrayList<RegisterAsPass> passUsingSystem=new ArrayList<>();
    ArrayList<RegisterAsDriver>driversUsingSystem=new ArrayList<>();
    ArrayList<RegisterAsDriver>pending_drivers= new ArrayList<RegisterAsDriver>();
    ArrayList<String>suspendingAccounts= new ArrayList<String>();
    ArrayList<Integer> ratingDriver=new ArrayList<>();

    public void setPassUsingSystem(RegisterAsPass obj);
    public void setAllRatings(int rate);
    public ArrayList<Integer> getRatings();
    public ArrayList<RateDriver>AllRatingsOfDriver=new ArrayList<>();
    public ArrayList<RateDriver>getAllRatingsOfDriver();
    public void setAllRatingsOfDriver(RateDriver obj);

    public void setPending_drivers(RegisterAsDriver obj) ;

    public void setSuspendingAccounts(String account_username) ;

    public ArrayList<String> getSuspendingAccounts();

    public void setDriversUsingSystem(RegisterAsDriver obj);

    public ArrayList<RegisterAsDriver> getDriversUsingSystem();
    public ArrayList<RegisterAsDriver> getPending_drivers();

    public ArrayList<RegisterAsPass> getPassUsingSystem();
}
