package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    Database obj2=new Database();
    private ArrayList<RegisterAsDriver> driversUsingTheSystem = new ArrayList();
    private ArrayList<String> suspendingAccounts = new ArrayList();
    Scanner input;
    private static Admin instance = new Admin();
    private static String UserName = "ADMIN_55";
    private static String Password = "12334567";


    RegisterAsDriver obj=new RegisterAsDriver();

    private Admin() {
        this.input = new Scanner(System.in);
    }

    public static void setPassword(String password) {
        Password = password;
    }

    public static void setUserName(String userName) {
        UserName = userName;
    }

    public static String getUserName() {
        //System.out.println(UserName);
        return UserName;
    }

    public static String getPassword() {
        //System.out.println(Password);
        return Password;
    }

    public static Admin getInstance() {
        return instance;
    }

    public void verifyRegistration() {
        System.out.println("This is the list of the pending drivers ,enter (accept or refuse) for each one of them to allow or prevent him from using the system:");

        for(int i = 0; i < obj2.getPending_drivers().size(); i++) {
            obj2.getPending_drivers().get(i);
            System.out.print(" : ");
            String stat = this.input.next();
            if (this.input.equals("accept")) {
                obj2.setDriversUsingSystem(obj2.getPending_drivers().get(i));
                obj.setMap_Driv(obj2.getPending_drivers().get(i).getUserName(),obj2.getPending_drivers().get(i).getPassword());
            } else {
                System.out.println("The admin refuse Your Registration");
            }
        }

    }

    public void suspendAccount(String userName) {
        boolean status = false;


        for(int i = 0; i < obj2.driversUsingSystem.size(); ++i) {
            if (userName.equals((obj2.driversUsingSystem.get(i)).getUserName())) {
                obj2.setSuspendingAccounts(userName);
                status = true;
                break;
            }
        }
        for(int i = 0; i < obj2.getPassUsingSystem().size(); ++i) {
            if (userName.equals((obj2.getPassUsingSystem().get(i)).getUserName())) {
                obj2.setSuspendingAccounts(userName);
                status = true;
                break;
            }
        }

        if (!status) {
            System.out.println("This UserName isn't correct and found on the System");
        }

    }

    public void activateAccount(String userName) {
        boolean status = false;

        for(int i = 0; i < obj2.getSuspendingAccounts().size(); ++i) {
            if ((obj2.getSuspendingAccounts().get(i)).equals(userName)) {
                obj2.getSuspendingAccounts().remove(i);
                status = true;
                break;
            }
        }

        if (!status) {
            if (obj2.getDriversUsingSystem().contains(userName)) {
                System.out.println("This account is found on the system but not suspended");
            } else if(obj2.getPassUsingSystem().contains(userName)){
                System.out.println("This account is found on the system but not suspended");
            }
            else {
                System.out.println("This UserName isn't correct and not found on the System");
            }
        }

    }

    public ArrayList<String> getSuspendingAccounts() {
        return obj2.getSuspendingAccounts();
    }

    public ArrayList<RegisterAsDriver> getDriversUsingTheSystem() {
        return obj2.getDriversUsingSystem();
    }
}
