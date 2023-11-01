package pl.housedevelopment.vehicle;

import pl.housedevelopment.EngineType;

public class CityVehicle extends Vehicle {
    int numberOfSeats;

    public CityVehicle(String name, double surfaceArea, VehicleType vehicleType, EngineType engineType, int horsepower, double engineCapacity, int numberOfSeats) {
        super(name, surfaceArea, vehicleType, engineType, horsepower, engineCapacity);
        this.numberOfSeats = numberOfSeats;
    }
}
