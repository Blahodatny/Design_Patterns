package patterns.creational.builder.components;

import patterns.creational.builder.cars.Car;

public class TripComputer {
    public void condition() {
        System.out.println(
                "Car is" + (Engine.isStarted() ? null : "n't") + " started"
        );
    }

    public void fuelLevel() {
        System.out.println("Level of fuel - " + Car.getFuel());
    }
}