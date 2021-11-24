package SW;

import java.util.Scanner;

public class TripPrice {
    Driver d;
passenger p;
     Scanner in=new Scanner(System.in);
     double price;
    public double PRICE(){
        System.out.println("enter the price of the trip");
        price=in.nextDouble();
        d.Notify();
        return price;
    }
    /*public double OFFPRICE(){
        System.out.println("enter the price of the trip");
        price=in.nextDouble();
        d.Notify();
        return (price/2);
    }*/
    void  offer(){
        System.out.println("enter the price of the trip ");
        price=in.nextDouble();
        p.Notify();//appears to passenger
    }
}
