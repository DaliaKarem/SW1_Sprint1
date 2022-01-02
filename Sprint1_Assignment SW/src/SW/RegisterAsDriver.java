package com.company;

import java.util.*;

public class RegisterAsDriver extends Register {
    private String License;
    private long nationalID;
    Data obj=new Database();

    public RegisterAsDriver() {
    }

    public RegisterAsDriver(String username, String pass, String email, long mobile, String license, long nationalid) {
        super(username, pass, email, mobile);
        this.License = license;
        this.nationalID = nationalid;
        //obj.setPending_drivers(new RegisterAsDriver(username, pass, email, mobile, license,nationalid));
    }

    public void setUserName(String userName) {
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
        return this.mobileNum;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.Password;
    }

    public long getNationalID() {
        return this.nationalID;
    }

    public String getLicense() {
        return this.License;
    }

    @Override
    public String toString() {
        return "{" +
                "Name='"+getUserName()+
                ", Password='"+getPassword()+
                ", License='" + getLicense() +
                ", nationalID=" + getNationalID() +
                ", Email" +Email+
                ", Mobile='"+getMobileNum()+
                '}';
    }

}
