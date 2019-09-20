package com.company.MediatorDP;

import java.util.ArrayList;
import java.util.List;

public class MyMediator implements Mediator {

    private List<BaseUser> users;

    public MyMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(BaseUser user) {
        this.users.add(user);
    }

    @Override
    public void removeUser(BaseUser user) {
        this.users.remove(user);
    }

    @Override
    public void sendMessagetoAll(String message, BaseUser user) {
        for(BaseUser usr: users){

            if(usr != user){
                usr.receiveMessage(message);
            }
        }
    }

}
