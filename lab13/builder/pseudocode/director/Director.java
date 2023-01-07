package builder.pseudocode.director;

import builder.pseudocode.builders.Builder;
import builder.pseudocode.cars.CarType;
import builder.pseudocode.components.Engine;
import builder.pseudocode.components.GPS;
import builder.pseudocode.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTripComputer(new TripComputer());
        builder.setGPS(new GPS());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTripComputer(new TripComputer());
        builder.setGPS(new GPS());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setGPS(new GPS());
    }
}
