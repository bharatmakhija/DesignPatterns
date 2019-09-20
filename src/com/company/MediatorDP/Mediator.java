package com.company.MediatorDP;

public interface Mediator {

    public void addUser(BaseUser user);
    public void removeUser(BaseUser user);
    public void sendMessagetoAll(String message, BaseUser user);
}
