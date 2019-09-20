package com.company.MediatorDP;

public class user implements BaseUser {

    private String name;
    private Mediator mediator;

    public user(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        this.mediator.addUser(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void sendMessage(String message) {
        this.mediator.sendMessagetoAll(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Message received by user " + getName() + " : " + message);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

}
