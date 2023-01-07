package builder.pseudocode.cars;

import builder.pseudocode.components.Engine;
import builder.pseudocode.components.GPS;
import builder.pseudocode.components.TripComputer;

public class Car {
    private CarType carType;
    private int seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, TripComputer tripComputer, GPS gps) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }

    public Car() {
        
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public GPS getGPS() {
        return gps;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
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
}
