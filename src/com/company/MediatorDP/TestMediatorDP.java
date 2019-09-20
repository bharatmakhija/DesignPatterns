package com.company.MediatorDP;

public class TestMediatorDP {

    public static void main(String[] args) {
        Mediator mediator =  new  MyMediator();
        BaseUser x = new user("bharat", mediator);
        BaseUser y = new user("lakshmi", mediator);
        BaseUser z = new user("sharath", mediator);
        x.sendMessage("hii");
        y.sendMessage("hello");
        z.sendMessage("hey");
    }
}
