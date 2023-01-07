package builder.pseudocode.builders;

import builder.pseudocode.cars.CarType;
import builder.pseudocode.cars.Manual;
import builder.pseudocode.components.Engine;
import builder.pseudocode.components.GPS;
import builder.pseudocode.components.TripComputer;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public Builder reset() {
        manual = new Manual();
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        manual.setSeats(seats);
        return this;
    }

    @Override
    public Builder setCarType(CarType carType) {
        manual.setCarType(carType);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        manual.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        manual.setTripComputer(tripComputer);
        return this;
    }

    @Override
    public Builder setGPS(GPS gps) {
        manual.setGPS(gps);
        return this;
    }

    public Manual getProduct() {
        Manual product = manual;
        this.reset();
        return product;
    }
}
