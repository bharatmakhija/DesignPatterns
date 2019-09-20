package com.company.ObserverDP;

public class MyObserver implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Update received by " + this.getName());
    }
}
