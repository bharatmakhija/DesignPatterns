package com.company.BuilderDP;

public class TestBuilderDP {

    public static void main(String[] args) {

        User x = new User.UserBuilder("bharat","makhija").age(27).phone("8989500455").address("asad").build();
        System.out.println(x);
        User y = new User.UserBuilder("bharat","makhija").age(27).build(); // optional variables can be appended or skipped!!
        System.out.println(y);

    }
}
