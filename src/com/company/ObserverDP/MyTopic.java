package com.company.ObserverDP;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    private  List<Observer> observers;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void deregister(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notfiyObservers() {
        observers.forEach(x-> x.update());
    }

    public void updateTopic(){
        System.out.println("Topic is updated");
        notfiyObservers();
    }
}
