package com.company;

import java.util.*;

public class RegisterAsDriver extends Register {
    private String License;
    private long nationalID;
    ArrayList<RegisterAsDriver> pendingDrivers = new ArrayList();
   // RegisterAsPass obj2=new RegisterAsPass();
    static Map<String,String>map_Driv=new HashMap<>();


    public RegisterAsDriver() {
    }

    public RegisterAsDriver(String username, String pass, String email, long mobile, String license, long nationalid) {
        super(username, pass, email, mobile);
        this.License = license;
        this.nationalID = nationalid;
    }

    public void setUserName(String userName) {
        Database obj=new Database();

        for(int i = 0; i < obj.getDriversUsingSystem().size(); ++i) {
            if (userName.equals(obj.getDriversUsingSystem().get(i).getUserName())) {
                System.out.println("This UserName is already exist on the system ,please enter another one:");
                Scanner input = new Scanner(System.in);
                userName = input.nextLine();
                this.setUserName(userName);
                break;
            }
        }

        this.userName = userName;
    }
    public static void setMap_Driv(String username,String pass) {
        map_Driv.put(username,pass);
    }

    public static Map<String, String> getMap_Driv() {
        return map_Driv;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setMobileNum(long mobileNum) {
        this.mobileNum = mobileNum;
    }

    public void setLicense(String license) {
        this.License = license;
    }

    public void setNationalID(long nationalID) {
        this.nationalID = nationalID;
    }

    public long getMobileNum() {
        //System.out.println(this.mobileNum);
        return this.mobileNum;
    }

    public String getEmail() {
        //System.out.println(this.Email);
        return this.Email;
    }

    public String getUserName() {
        //System.out.println(this.userName);
        return this.userName;
    }

    public String getPassword() {
        //System.out.println(this.Password);
        return this.Password;
    }

    public long getNationalID() {
        //System.out.println(this.nationalID);
        return this.nationalID;
    }

    public String getLicense() {
        //System.out.println(this.License);
        return this.License;
    }

    public ArrayList<RegisterAsDriver> getPendingDrivers() {
        return this.pendingDrivers;
    }
}
