package com.company.factoryDP;

public class PlanFactory {

    public Plan getPlan(String planType){


        if(null == planType){
            return null;
        }

        if(planType.equalsIgnoreCase("DOMESTIC"))
            return new DomesticPlan();

        if(planType.equalsIgnoreCase("COMMERCIAL"))
            return new CommertialPlan();

        return null;
    }
}
