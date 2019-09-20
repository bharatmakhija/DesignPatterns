package com.company.ObserverDP;

public interface Subject {

    public void register(Observer observer);
    public void deregister(Observer observer);

    public void notfiyObservers();
    public void updateTopic();
}
