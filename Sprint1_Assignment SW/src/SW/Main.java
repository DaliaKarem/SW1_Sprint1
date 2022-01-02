package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Data obj9 = new Database();
        Driver obj3 = new Driver();
        Offer obj4 = new Offer();
        RateDriver obj6 = new RateDriver();
        Passenger obj7 = new Passenger();
        Login obj5 = new Login();
        Admin obj2 = Admin.getInstance();
        new RegisterAsPass();
        RegisterAsDriver obj = new RegisterAsDriver();
        RegisterAsPass obj1 = new RegisterAsPass();
        Scanner input = new Scanner(System.in);
        int choice1, choice2, choice3, choice4;
        while (true) {
            System.out.println("_ WELCOME TO OUR SYSTEM :) _");
            System.out.println("Enter the choice which U want ,please:");
            System.out.println("1-I am the admin of the system");
            System.out.println("2-Register as Driver");
            System.out.println("3-Register as Passenger");
            System.out.println("4-Login");
            System.out.println("5-Exit");

            choice1 = input.nextInt();
            if (choice1 == 5) {
                break;
            }
            switch (choice1) {
                case 1:
                    System.out.println("Enter the username and password ,please:");
                    System.out.print("UserName: ");
                    String name = input.next();
                    System.out.print("Password: ");
                    String pass = input.next();
                    if (obj5.check_Admin(name, pass)==true) {
                        System.out.println("_Welcome to your account_");
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
                    String email = input.next();
                    System.out.print("MobileNumber: ");
                    long mobile = input.nextLong();
                    System.out.print("Licence: ");
                    String licence = input.next();
                    System.out.print("NationalID: ");
                    long nationalID = input.nextLong();

                    //System.out.println(obj.toString());
                    //System.out.println(obj.getNationalID());
                    if (name4.equals(obj2.getUserName()) || name4.equals("")) {
                        System.out.println("Invalid username");
                    } else {
                        obj.setUserName(name4);
                        obj = new RegisterAsDriver(name4, pass2, email, mobile, licence, nationalID);
                        obj9.setPending_drivers(obj);
                        System.out.println("Wait the verification of the account from Admin ,please");
                        System.out.println("please,Login to check if your account is verified or still not");
                    }
                    break;
                case 3:
                    System.out.println("Enter the following Info,please:");
                    System.out.print("UserName: ");
                    String name5 = input.next();
                    System.out.print("Password: ");
                    String pass3 = input.next();
                    System.out.print("Email :");
                    String email1 = input.next();
                    System.out.print("MobileNumber: ");
                    long mobile1 = input.nextLong();
                    System.out.println("Date of Birth:");
                    String DOB=input.next();
                    if (name5.equals(obj2.getUserName()) || name5.equals("")) {
                        System.out.println("Invalid username");
                    } else {
                        obj1.setUserName(name5);

                        obj1 = new RegisterAsPass(name5, pass3, email1, mobile1,DOB);
                        //obj1.setPassengers(obj1);
                        obj9.setPassUsingSystem(obj1);
                        //obj1.setMap_pass(name5,pass3);
                        while (true) {
                            System.out.println("Enter the choice which U want ,please:");
                            System.out.println("1-Request A ride");
                            System.out.println("2-Rate the Driver (1 worst to 5 Best)");
                            System.out.println("3-Display the average rating of the driver");
                            System.out.println("4-Show notifications from the driver");
                            System.out.println("5-Logout");
                            choice4 = input.nextInt();
                            if (choice4 == 5) {
                                break;
                            }
                            switch (choice4) {
                                case 1:
                                    System.out.print("Enter the source area ,please");
                                    String Source = input.next();
                                    System.out.print("Enter the destination area ,please");
                                    String des = input.next();
                                    boolean status = false;
                                /*for (int i=0;i<obj3.getFavAreas().size();i++){
                                    if(Source.equals(obj3.getfavAreas().get(i))){
                                        status=true;
                                        break;
                                    }
                                }*/
                                    //if(status==true){
                                    obj3.setSrcAreaList(Source);
                                    //    counter++;
                                    //}
                                    System.out.println("Enter the number of passengers ,please:");
                                    int number;
                                    number=input.nextInt();
                                    System.out.println("Enter the Driver id who u will ride with  ,please:");
                                    long ID=input.nextLong();
                                    obj7.requestARide(Source, des,number,ID);
                                    System.out.println("Your ride is requested successfully");
                                    //System.out.println(obj7.getSrcName());
                                    break;
                                case 2:
                                    System.out.print("Enter the number of rate (1 worst to 5 Best) ,please: ");
                                    int rate = input.nextInt();
                                    System.out.println("Enter the nationalID of the driver ,please:");
                                    long id = input.nextLong();
                                    obj6.rateTheDriver(id, rate);
                                    System.out.println("Done");
                                    break;
                                case 3:
                                    obj6.displayAverageRating();
                                    break;
                                case 4:
                                    obj4.notify_Passenger();
                                    break;
                                default:
                                    System.out.println("Invalid choice ,please enter another one");
                                    break;
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("1-Login as driver");
                    System.out.println("2-login as passenger");
                    int choice;
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.print("Enter your username ,please: ");
                        String username = input.next();
                        System.out.print("Enter your password ,please: ");
                        String pass_word = input.next();
                        if (obj5.check_driver(username, pass_word)) {
                            while (true) {
                                System.out.println("Enter the choice which U want ,please:");
                                System.out.println("1-Set my FAV. areas");
                                System.out.println("2-Show my FAV. areas");
                                System.out.println("3-Show the list of source areas that are matched with the FAV. areas ");
                                System.out.println("4-Set offer to this source area");
                                System.out.println("5-Show if any notifications from passengers");
                                System.out.println("6-Display all passengers ratings");
                                System.out.println("7-Display the average rating");
                                System.out.println("8-Logout");
                                choice3 = input.nextInt();
                                if (choice3 == 8) {
                                    break;
                                }
                                switch (choice3) {
                                    case 1:
                                        System.out.print("Enter the number of FAV. areas U want to enter ,please: ");
                                        int count = input.nextInt();
                                        String FAV;
                                        for (int i = 0; i < count; i++) {
                                            FAV = input.next();
                                            obj3.setFavAreas(FAV);
                                        }
                                        break;
                                    case 2:
                                        System.out.println(obj3.getFavAreas());
                                        break;
                                    case 3:
                                        System.out.println(obj3.getSrcAreaList());
                                        break;
                                    case 4:
                                        System.out.print("Enter the offer U want to set please: ");
                                        double offer;
                                        offer = input.nextDouble();
                                        obj4.setPrice(offer);
                                        break;
                                    case 5:
                                        obj7.Notify_Driver();
                                        break;
                                    case 6:
                                        System.out.println(obj9.getRatings());
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
                    }else if(choice==2){
                        System.out.print("Enter your username ,please: ");
                        String username = input.next();
                        System.out.print("Enter your password ,please: ");
                        String pass_word = input.next();
                        if (obj5.check_pass(username, pass_word)){
                            while (true) {
                                System.out.println("Enter the choice which U want ,please:");
                                System.out.println("1-Request A ride");
                                System.out.println("2-Rate the Driver (1 worst to 5 Best)");
                                System.out.println("3-Display the average rating of the driver");
                                System.out.println("4-Show notifications from the driver");
                                System.out.println("5-Logout");
                                choice4 = input.nextInt();
                                if (choice4 == 5) {
                                    break;
                                }
                                switch (choice4) {
                                    case 1:
                                        System.out.print("Enter the source area ,please");
                                        String Source = input.next();
                                        System.out.print("Enter the destination area ,please");
                                        String des = input.next();
                                        boolean status = false;
                                /*for (int i=0;i<obj3.getFavAreas().size();i++){
                                    if(Source.equals(obj3.getfavAreas().get(i))){
                                        status=true;
                                        break;
                                    }
                                }*/
                                        //if(status==true){
                                        obj3.setSrcAreaList(Source);
                                        //    counter++;
                                        //}
                                        System.out.println("Enter the number of passengers ,please:");
                                        int num;
                                        num=input.nextInt();
                                        System.out.println("Enter the Driver ID who u will ride with ,please:");
                                         long ID=input.nextLong();
                                        obj7.requestARide(Source, des,num,ID);
                                        //System.out.println(obj7.getSrcName());
                                        break;
                                    case 2:
                                        System.out.print("Enter the number of rate (1 worst to 5 Best) : ");
                                        int rate = input.nextInt();
                                        System.out.println("Enter the nationalID of the driver :");
                                        long id = input.nextLong();
                                        obj6.rateTheDriver(id, rate);
                                        obj9.setAllRatingsOfDriver(obj6);
                                        break;
                                    case 3:
                                        obj6.displayAverageRating();
                                        break;
                                    case 4:
                                        obj4.notify_Passenger();
                                        break;
                                    default:
                                        System.out.println("Invalid choice ,please enter another one");
                                        break;
                                }
                            }
                        }
                    }else {
                        System.out.println("invalid choice");
                    }
                    break;
            default:
                System.out.println("Invalid choice ,please enter another one");
                break;
        }
        }
        /*System.out.println(obj9.getPending_drivers().get(0).getNationalID());
        System.out.println(obj9.getPending_drivers());*/
    }
}
