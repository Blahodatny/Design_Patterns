package patterns.creational.builder.cars;

import patterns.creational.builder.components.Engine;
import patterns.creational.builder.components.GPSNavigator;
import patterns.creational.builder.components.Transmission;
import patterns.creational.builder.components.TripComputer;

public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(Type type, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        return ("Type of car: " + type + "\n") +
                "Count of seats: " + seats + "\n" +
                "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n" +
                "Transmission: " + transmission + "\n" +
                "Trip Computer: Trip Computer" + "\n" +
                "GPS Navigator: GPS Navigator" + "\n";
    }
}