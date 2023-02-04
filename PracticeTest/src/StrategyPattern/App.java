package StrategyPattern;

public class App {
    public static void main(String[] args) throws Exception {
        Vehicle sportsVehicle= new SportsVehicle();
        Vehicle normalVehicle= new NormalVehicle();
        sportsVehicle.drive();
        normalVehicle.drive();
    }
}
