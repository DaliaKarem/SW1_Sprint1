package com.company;

import java.util.ArrayList;

public class GetNotifications implements Observer{

    @Override
    public void Notify_Passenger() {
        update_Passenger();
    }

    @Override
    public void Notify_Driver() {
        update_Driver();
    }

    @Override
    public void update_Passenger() {
        System.out.print("The offer of this source area is: ");
    }

    @Override
    public void update_Driver() {
        System.out.println("There are an source areas matched with your FAV. areas entered by the passengers");
    }












}
