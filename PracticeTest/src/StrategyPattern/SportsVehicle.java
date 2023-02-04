package StrategyPattern;
import StrategyPattern.Strategy.SportsDriver;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
         super(new SportsDriver());
    }
    
}
