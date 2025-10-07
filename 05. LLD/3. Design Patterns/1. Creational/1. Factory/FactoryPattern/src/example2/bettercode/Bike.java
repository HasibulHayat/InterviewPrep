package example2.bettercode;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike start");
    }

    @Override
    public void stop() {
        System.out.println("Bike stop");
    }

    @Override
    public int getRentalCost() {
        return 500;
    }
}
