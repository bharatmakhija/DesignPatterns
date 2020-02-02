package com.company.factoryDP;

public class FactoryTest {

    public static void main(String[] args) {

        PlanFactory planFactory = new PlanFactory();

        Plan plan = planFactory.getPlan("DOMESTIC");
        plan.getrate();
        plan.calculateBill(3);

        plan = planFactory.getPlan("COMMERCIAL");
        plan.getrate();
        plan.calculateBill(3);
    }
}
