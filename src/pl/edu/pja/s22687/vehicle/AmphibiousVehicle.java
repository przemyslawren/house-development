package pl.edu.pja.s22687.vehicle;

public class AmphibiousVehicle extends Vehicle {
    double height;

    public AmphibiousVehicle(String name, double surfaceArea, VehicleType vehicleType, EngineType engineType, int horsepower, double engineCapacity, double height) {
        super(name, surfaceArea, vehicleType, engineType, horsepower, engineCapacity);
        this.height = height;
    }
}
