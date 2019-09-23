package com.company.PrototypeDP;

public class TestPrototypeDP {

    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.addEmoployee("bharat");
        employees.addEmoployee("lakshmi");
        Employees employees1 = null;
        try{
            employees1 = employees.clone();
            employees1.addEmoployee("veera");
        }catch (Exception e){}

        System.out.println(employees);
        System.out.println(employees1);
    }
}
