package example2;

import example2.bettercode.Vehicle;
import example2.bettercode.VehicleFactory;

public class SecondMain {
    public static void main(String[] args) {
        System.out.println("This is the second example section ... \n");

        String vehicleType = "car";

//        Vehicle vehicle;
//
//        if (vehicleType.equals("truck")) {
//            vehicle = new Truck();
//            vehicle.start();
//            System.out.println(vehicle.getRentalCost());
//        }
//        else if (vehicleType.equals("car")) {
//            vehicle = new Car();
//            vehicle.start();
//            System.out.println(vehicle.getRentalCost());
//        }
//        else if (vehicleType.equals("bike")) {
//            vehicle = new Bike();
//            vehicle.start();
//            System.out.println(vehicle.getRentalCost());
//        }
//        else {
//            System.out.println("Invalid vehicle type");
//        }

        VehicleFactory factory = new VehicleFactory();

        Vehicle vehicle = factory.createVehicle(vehicleType);
        vehicle.start();
        System.out.println(vehicle.getRentalCost());
    }
}
