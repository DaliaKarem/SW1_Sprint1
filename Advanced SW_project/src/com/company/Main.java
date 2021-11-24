package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Database obj9=new Database();
        int counter=0;
        int counter2=0;
        Driver obj3=new Driver();
        Offer obj4=new Offer();
        GetNotifications obj5=new GetNotifications();
        RateDriver obj6=new RateDriver();
        Passenger obj7=new Passenger();
        Admin obj2 = null;
        obj2 = Admin.getInstance();
        new RegisterAsPass();
        RegisterAsDriver obj=new RegisterAsDriver();
        RegisterAsPass obj1=new RegisterAsPass();
        Scanner input = new Scanner(System.in);
        int choice1,choice2,choice3,choice4;
        while (true){
        System.out.println("_ WELCOME TO OUR SYSTEM :) _");
        System.out.println("Enter the choice which U want ,please:");
        System.out.println("1-I am the admin of the system");
        System.out.println("2-Register as Driver");
        System.out.println("3-Register as Passenger");
        System.out.println("4-Exit");

        choice1 = input.nextInt();
        if (choice1==4){
            break;
        }
        switch(choice1) {
            case 1:
                System.out.println("Enter the username and password ,please:");
                System.out.print("UserName: ");
                String name = input.next();
                System.out.print("Password: ");
                String pass = input.next();
                if (name.equals(obj2.getUserName()) && pass.equals(obj2.getPassword())) {
                    while (true) {
                        System.out.println("Enter the choice which U want ,please:");
                        System.out.println("1-View the list of pending drivers accounts and verify them");
                        System.out.println("2-Suspending any account");
                        System.out.println("3-Activate any account");
                        System.out.println("4-Logout");
                        choice2 = input.nextInt();
                        if (choice2 == 4) {
                            break;
                        }
                        switch (choice2) {
                            case 1:
                                obj2.verifyRegistration();
                                break;
                            case 2:
                                System.out.print("Enter the Username of the account U want to suspend ,please:");
                                String name2 = input.next();
                                obj2.suspendAccount(name2);
                                obj9.setSuspendingAccounts(name2);
                                break;
                            case 3:
                                System.out.print("Enter the Username of the account U want to activate ,please:");
                                String name3 = input.next();
                                obj2.activateAccount(name3);
                                break;
                            default:
                                System.out.println("Invalid choice ,enter another one ,please");
                                break;
                        }
                    }
                } else {
                    System.out.println("Wrong UserName or Password");
                }
                break;
            case 2:
                System.out.println("Enter the following Info,please:");
                System.out.print("UserName: ");
                String name4 = input.next();
                System.out.print("Password: ");
                String pass2 = input.next();
                System.out.print("Email :");
                String email=input.next();
                System.out.print("MobileNumber: ");
                long mobile=input.nextLong();
                System.out.print("Licence: ");
                String licence=input.next();
                System.out.print("NationalID: ");
                long nationalID=input.nextLong();
                if (name4.equals(obj2.getUserName()) || name4.equals("")) {
                    System.out.println("Invalid username");
                }else {
                    obj.setUserName(name4);
                    obj=new RegisterAsDriver(obj.getUserName(),pass2,email,mobile,licence,nationalID);
                    obj9.setPending_drivers(obj);
                    while (true){
                        System.out.println("Enter the choice which U want ,please:");
                        System.out.println("1-Set my FAV. areas");
                        System.out.println("2-Show my FAV. areas");
                        System.out.println("3-Show the list of source areas that are matched with the FAV. areas ");
                        System.out.println("4-Set offer to this source area");
                        System.out.println("5-Show if any notifications from passengers");
                        System.out.println("6-Display all passengers ratings");
                        System.out.println("7-Display the average rating");
                        System.out.println("8-Logout");
                        choice3=input.nextInt();
                        if(choice3==8){
                            break;
                        }
                        switch (choice3){
                            case 1:
                                System.out.print("Enter the number of FAV. areas U want to enter ,please: ");
                                int count=input.nextInt();
                                String FAV;
                                for (int i=0;i<count;i++){
                                    FAV=input.next();
                                    obj3.setFavAreas(FAV);
                                }
                                break;
                            case 2:
                                obj3.getFavAreas();
                                break;
                            case 3:
                                obj3.getSrcAreaList();
                                break;
                            case 4:
                                System.out.print("Enter the offer U want to set please: ");
                                double offer;
                                counter2++;
                                for (int i=0;i<obj3.getSrcAreaList().size();i++){
                                    System.out.print(obj3.getSrcAreaList().get(i)+": ");
                                    offer=input.nextDouble();
                                    obj4.setPrice(offer);
                                }
                                break;
                            case 5:
                                if(counter>0){
                                    obj5.Notify_Driver();
                                    obj3.getSrcAreaList();
                                }
                                break;
                            case 6:
                                obj6.getRatings();
                                break;
                            case 7:
                                obj6.displayAverageRating();
                                break;
                            default:
                                System.out.println("Invalid choice ,please enter another one");
                                break;
                        }
                    }
                }
                break;
            case 3:
                System.out.println("Enter the following Info,please:");
                System.out.print("UserName: ");
                String name5 = input.next();
                System.out.print("Password: ");
                String pass3 = input.next();
                System.out.print("Email :");
                String email1=input.next();
                System.out.print("MobileNumber: ");
                long mobile1=input.nextLong();
                if (name5.equals(obj2.getUserName()) || name5.equals("")) {
                    System.out.println("Invalid username");
                }else {
                    obj1.setUserName(name5);
                    obj1=new RegisterAsPass(name5,pass3,email1,mobile1);
                    //obj1.setPassengers(obj1);
                    obj9.setPassUsingSystem(obj1);
                    obj1.setMap_pass(name5,pass3);
                    while (true) {
                        System.out.println("Enter the choice which U want ,please:");
                        System.out.println("1-Request A ride");
                        System.out.println("2-Rate the Driver (1 worst to 5 Best)");
                        System.out.println("3-Show the diver FAV. areas");
                        System.out.println("4-Display the average rating of the driver");
                        System.out.println("5-Show notifications from the driver");
                        System.out.println("6-Logout");
                        choice4=input.nextInt();
                        if(choice4==6){
                            break;
                        }
                        switch (choice4){
                            case 1:
                                System.out.print("Enter the source area ,please");
                                String Source=input.next();
                                System.out.print("Enter the destination area ,please");
                                String des=input.next();
                                boolean status=false;
                                for (int i=0;i<obj3.getFavAreas().size();i++){
                                    if(Source.equals(obj3.getfavAreas().get(i))){
                                        status=true;
                                        break;
                                    }
                                }
                                if(status==true){
                                    obj3.setSrcAreaList(Source);
                                    counter++;
                                }
                                obj7.requestARide(Source,des);
                                break;
                            case 2:
                                System.out.print("Enter the number of rate (1 worst to 5 Best) ,please: ");
                                int rate=input.nextInt();
                                obj6.rateTheDriver(rate);
                                break;
                            case 3:
                                obj3.getFavAreas();
                                break;
                            case 4:
                                obj6.displayAverageRating();
                                break;
                            case 5:
                                if(counter2>0){
                                    obj5.Notify_Passenger();
                                    System.out.println(obj4.getPrice());
                                }
                                break;
                            default:
                                System.out.println("Invalid choice ,please enter another one");
                                break;
                        }
                    }
                }
                break;
            default:
                System.out.println("Invalid choice ,please enter another one");
                break;
        }
        }
    }
}
