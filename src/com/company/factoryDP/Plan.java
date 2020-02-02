package com.company.factoryDP;

public abstract class Plan {

    protected double rate;

    abstract void getrate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
