package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegisterAsPass extends Register {
    private ArrayList<RegisterAsPass> passengers = new ArrayList();
    //RegisterAsDriver obj=new RegisterAsDriver();
    static Map<String,String>map_pass=new HashMap<>();
    Database obj=new Database();

    public RegisterAsPass() {
    }

    public RegisterAsPass(String username, String pass, String email, long mobile) {
        super(username, pass, email, mobile);
    }

    public void setUserName(String userName) {
        for(int i = 0; i < obj.getPassUsingSystem().size(); ++i) {
            if (userName.equals(obj.getPassUsingSystem().get(i).getUserName())) {
                System.out.println("This UserName is already exist on the system ,please enter another one:");
                Scanner input = new Scanner(System.in);
                userName = input.nextLine();
                this.setUserName(userName);
                break;
            }
        }

        this.userName = userName;
    }
    public static void setMap_pass(String username,String pass) {
        map_pass.put(username,pass);
    }

    public static Map<String, String> getMap_pass() {
        return map_pass;
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

    public void setPassengers(RegisterAsPass obj) {
        this.passengers.add(obj);
    }

    public long getMobileNum() {
        System.out.println(this.mobileNum);
        return this.mobileNum;
    }

    public String getEmail() {
        System.out.println(this.Email);
        return this.Email;
    }

    public String getUserName() {
        System.out.println(this.userName);
        return this.userName;
    }

    public String getPassword() {
        System.out.println(this.Password);
        return this.Password;
    }

    public ArrayList<RegisterAsPass> getPassengers() {
       return this.passengers;
    }
}
