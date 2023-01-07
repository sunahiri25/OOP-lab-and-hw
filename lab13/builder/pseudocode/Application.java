package builder.pseudocode;

import builder.pseudocode.builders.CarBuilder;
import builder.pseudocode.builders.CarManualBuilder;
import builder.pseudocode.cars.Car;
import builder.pseudocode.cars.Manual;
import builder.pseudocode.director.Director;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getProduct();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getProduct();
        System.out.println("Car manual built:\n" + carManual.print());
    }
}
