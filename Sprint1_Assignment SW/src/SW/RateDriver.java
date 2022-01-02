package com.company;

import java.util.Scanner;

public class RateDriver extends Rating{
    Data obj=new Database();
    String username;
    int rate;

    private static int[] stars={1,2,3,4,5};

    public RateDriver(){

    }

    public RateDriver(String username){
        this.username=username;
    }
    public void rateTheDriver(long id,int rate){
            Scanner input=new Scanner(System.in);
            boolean check=false;
            for(int j=0;j<obj.getDriversUsingSystem().size();j++){
                if(obj.getDriversUsingSystem().get(j).getNationalID()==id){
                    boolean status=false;
                    for (int i=0;i<5;i++){
                        if(rate==stars[i]){
                            obj.setAllRatings(rate);
                            this.rate=rate;
                            status=true;
                            break;
                        }
                    }
                    if(status==false){
                        System.out.print("Invalid rate ,Enter another one ,please:");
                        rate=input.nextInt();
                        rateTheDriver(id,rate);
                    }
                    check=true;
                    break;
                }
            }
            if(check==false){
                System.out.println("This driver isn't found on the system or invalid ID");
                System.out.println("1-enter another one.");
                System.out.println("2-exit.");
                int choice;
                choice=input.nextInt();
                if (choice==1){
                    System.out.println("enter the ID:");
                    id = input.nextLong();
                    System.out.println("enter the rate:");
                    rate=input.nextInt();
                    rateTheDriver( id, rate);
                }else if(choice==2){
                    return;
                }else {
                    System.out.println("invalid choice");
                }
            }
    }

    @Override
    public void displayAverageRating() {
        int sum=0;
        for (int i=0;i<obj.getRatings().size();i++){
            sum+=obj.getRatings().get(i);
        }
        double average_rating=sum/obj.getRatings().size();
        System.out.println("AverageRate :"+average_rating);
    }

    @Override
    public String toString() {
        return username + " : " + rate + '\n';
    }
}
