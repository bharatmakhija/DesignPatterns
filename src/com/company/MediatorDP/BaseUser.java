package com.company.MediatorDP;

public interface BaseUser {

    public void sendMessage(String message);
    public void receiveMessage(String message);
    public void setMediator(Mediator mediator);
}
