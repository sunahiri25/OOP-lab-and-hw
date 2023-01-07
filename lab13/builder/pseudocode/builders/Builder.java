package builder.pseudocode.builders;

import builder.pseudocode.cars.CarType;
import builder.pseudocode.components.Engine;
import builder.pseudocode.components.GPS;
import builder.pseudocode.components.TripComputer;

public interface Builder {
    Builder reset();

    Builder setCarType(CarType carType);

    Builder setSeats(int seats);

    Builder setEngine(Engine engine);

    Builder setTripComputer(TripComputer tripComputer);

    Builder setGPS(GPS gps);

}
