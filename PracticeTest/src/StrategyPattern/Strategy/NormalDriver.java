package StrategyPattern.Strategy;

public class NormalDriver implements DriverStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
        
    }
    
}
