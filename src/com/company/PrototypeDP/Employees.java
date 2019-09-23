package com.company.PrototypeDP;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> employeeNames;

    public Employees(List<String> employeeNames) {
        this.employeeNames = employeeNames;
    }

    public Employees() {
        this.employeeNames = new ArrayList<String>();
    }

    public void addEmoployee(String name){
        this.employeeNames.add(name);
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeNames=" + employeeNames +
                '}';
    }

    @Override
    protected Employees clone() throws CloneNotSupportedException {
        List<String> ls = new ArrayList<String>();
        for(String s : this.employeeNames){
            ls.add(s);
        }
        return new Employees(ls);
    } // adding this clone method is nothing but prototypeDP!!

}
