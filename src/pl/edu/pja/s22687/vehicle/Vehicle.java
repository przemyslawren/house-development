package pl.edu.pja.s22687.vehicle;

import pl.edu.pja.s22687.apartment.Item;

public abstract class Vehicle extends Item {
    private VehicleType vehicleType;
    private EngineType engineType;
    private int horsepower;
    private double engineCapacity;

    public Vehicle(String name, double area, VehicleType vehicleType, EngineType engineType, int horsepower, double engineCapacity) {
        super(name, area);
        this.vehicleType = vehicleType;
        this.engineType = engineType;
        this.horsepower = horsepower;
        this.engineCapacity = engineCapacity;
    }
}
