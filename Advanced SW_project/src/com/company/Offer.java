package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Offer implements Price{
    public double offer = 0;
    Map<String,Double> prices=new HashMap<>();

    @Override
    public void setPrice(double price) {
        this.offer=price;
    }

    @Override
    public double getPrice() {
        System.out.print(offer);
        return offer;

    }
}

