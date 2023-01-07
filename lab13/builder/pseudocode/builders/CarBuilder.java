package builder.pseudocode.builders;

import builder.pseudocode.cars.Car;
import builder.pseudocode.cars.CarType;
import builder.pseudocode.components.Engine;
import builder.pseudocode.components.GPS;
import builder.pseudocode.components.TripComputer;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public Builder reset() {
        car = new Car();
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        car.setSeats(seats);
        return this;
    }

    @Override
    public Builder setCarType(CarType carType) {
        car.setCarType(carType);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        car.setTripComputer(tripComputer);
        return this;
    }

    @Override
    public Builder setGPS(GPS gps) {
        car.setGPS(gps);
        return this;
    }

    public Car getProduct() {
        Car product = car;
        this.reset();
        return product;
    }
}
