package com.company;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin implements Observer_Admin{
    Data obj2=new Database();
    Scanner input;
    private static Admin instance = new Admin();
    private static String UserName = "ADMIN_55";
    private static String Password = "12334567";

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
        return UserName;
    }

    public static String getPassword() {
        return Password;
    }

    public static Admin getInstance() {
        return instance;
    }

    public void verifyRegistration() {
        System.out.println("This is the list of the pending drivers ,enter (accept or refuse) for each one of them to allow or prevent him from using the system:");
        for(int i = 0; i < obj2.getPending_drivers().size(); i++) {
            System.out.print(obj2.getPending_drivers().get(i));
            System.out.print("accept/refuse)" +" : ");
            String stat = input.next();
            if (stat.equals("accept")) {
                obj2.setDriversUsingSystem(obj2.getPending_drivers().get(i));
            } else if(stat.equals("refuse")){
                System.out.println("The Registration is refused successfully");
            }else {
                System.out.println("invalid input");
            }
        }

    }

    public void suspendAccount(String userName) {
        boolean status = false;
        for(int i = 0; i < obj2.driversUsingSystem.size(); i++) {
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


    @Override
    public void update_Price(double price, String eventName, String driver_name, LocalTime time) {
        System.out.println("Event Name: "+eventName);
        System.out.println("Driver Name: "+driver_name);
        System.out.println("The price of the ride is: "+price);
        System.out.println("Time: "+time);
    }

    @Override
    public void update_isArrivedLoc(boolean arrived, String eventName, String driver_name, LocalTime time, String pass_name) {
        System.out.println("Event Name: "+eventName);
        System.out.println("Driver Name: "+driver_name);
        System.out.println("Passenger Name: "+pass_name);
        System.out.println("Time: "+time);
        if(arrived){
         System.out.println("Now The driver arrived Location");
     }else{
            System.out.println("The driver still not arrived Location");
        }
    }

    @Override
    public void update_isArrivedDes(boolean arrived, String eventName, String driver_name, LocalTime time, String pass_name) {
        System.out.println("Event Name: "+eventName);
        System.out.println("Driver Name: "+driver_name);
        System.out.println("Passenger Name: "+pass_name);
        System.out.println("Time: "+time);
        if(arrived){
            System.out.println("Now The driver arrived Destination");
        }else{
            System.out.println("The driver still not arrived Destination");
        }
    }

    @Override
    public void update_isAccept(boolean accept, String eventName, String pass_name, LocalTime time) {
        System.out.println("Event Name: "+eventName);
        System.out.println("Passenger Name: "+pass_name);
        System.out.println("Time: "+time);
        if(accept){
            System.out.println("The passenger accepts the price that the driver has put");
        }else{
            System.out.println("The passenger refuses the price that the driver has put");
        }
    }
}
