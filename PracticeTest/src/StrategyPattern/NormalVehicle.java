package StrategyPattern;
import StrategyPattern.Strategy.NormalDriver;

public class NormalVehicle extends Vehicle {

    public NormalVehicle() {
        super(new NormalDriver());
    }
    
}
