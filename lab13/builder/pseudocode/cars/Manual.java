package builder.pseudocode.cars;

import builder.pseudocode.components.Engine;
import builder.pseudocode.components.GPS;
import builder.pseudocode.components.TripComputer;

public class Manual {
    private CarType carType;
    private int seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;

    public Manual(CarType carType, int seats, Engine engine, TripComputer tripComputer, GPS gps) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }

    public Manual() {

    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setGPS(GPS gps) {
        this.gps = gps;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gps != null) {
            info += "GPS: Functional" + "\n";
        } else {
            info += "GPS: N/A" + "\n";
        }
        return info;
    }
}
