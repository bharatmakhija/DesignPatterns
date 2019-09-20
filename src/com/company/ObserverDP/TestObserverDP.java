package com.company.ObserverDP;

public class TestObserverDP {

    public static void main(String[] args) {

        Subject topic = new MyTopic();
        Observer x1 = new MyObserver("Observer1");
        Observer x2 = new MyObserver("Observer2");
        Observer x3 = new MyObserver("Observer3");

        topic.register(x1);
        topic.register(x2);
        topic.register(x3);
        topic.updateTopic();

    }
}
