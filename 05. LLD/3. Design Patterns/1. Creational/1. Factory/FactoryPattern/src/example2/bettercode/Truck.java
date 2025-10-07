package example2.bettercode;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck start");
    }

    @Override
    public void stop() {
        System.out.println("Truck stop");
    }

    @Override
    public int getRentalCost() {
        return 4000;
    }
}