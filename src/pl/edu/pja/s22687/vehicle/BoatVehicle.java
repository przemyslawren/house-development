package pl.edu.pja.s22687.vehicle;

public class BoatVehicle extends Vehicle {
    double length;

    public BoatVehicle(String name, double surfaceArea, VehicleType vehicleType, EngineType engineType, int horsepower, double engineCapacity, double length) {
        super(name, surfaceArea, vehicleType, engineType, horsepower, engineCapacity);
        this.length = length;
    }
}
