package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class RateDriver extends Rating{
    private ArrayList<Integer> ratingDriver=new ArrayList<>();
    private static int[] stars={1,2,3,4,5};

    public RateDriver(){

    }
    public void rateTheDriver(int rate){
        boolean status=false;
        for (int i=0;i<5;i++){
            if(rate==stars[i]){
                ratingDriver.add(rate);
                status=true;
                break;
            }
        }
        if(status==false){
            System.out.print("Invalid rate ,Enter another one ,please:");
            Scanner input=new Scanner(System.in);
            rate=input.nextInt();
            rateTheDriver(rate);
        }
    }
    public ArrayList<Integer> getRatingDriver(){

        return this.ratingDriver;
    }
    public void getRatings(){
        System.out.println(this.ratingDriver);
    }

    @Override
    public void displayAverageRating() {
        int sum=0;
        for (int i=0;i<getRatingDriver().size();i++){
            sum+=getRatingDriver().get(i);
        }
        double average_rating=sum/getRatingDriver().size();
        System.out.println("AverageRate :"+average_rating);
    }
}
