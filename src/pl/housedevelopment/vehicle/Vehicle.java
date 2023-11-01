package pl.housedevelopment.vehicle;

import pl.housedevelopment.EngineType;

abstract class Vehicle {
    private String name;
    private double surfaceArea;
    private VehicleType vehicleType;
    private EngineType engineType;
    private int horsepower;
    private double engineCapacity;

    public Vehicle(String name, double surfaceArea, VehicleType vehicleType, EngineType engineType, int horsepower, double engineCapacity) {
        this.name = name;
        this.surfaceArea = surfaceArea;
        this.vehicleType = vehicleType;
        this.engineType = engineType;
        this.horsepower = horsepower;
        this.engineCapacity = engineCapacity;
    }

}
