package StrategyPattern;

import StrategyPattern.Strategy.DriverStrategy;

public class Vehicle {
    DriverStrategy driverStrategy;
    Vehicle(DriverStrategy driverStrategies){
        this.driverStrategy=driverStrategies;
    }
    public void drive(){
        driverStrategy.drive();
    }
    
}
