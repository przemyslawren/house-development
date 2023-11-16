package pl.housedevelopment.vehicle;

abstract class Vehicle {
    private String name;
    private double area;
    private VehicleType vehicleType;
    private EngineType engineType;
    private int horsepower;
    private double engineCapacity;

    public Vehicle(String name, double area, VehicleType vehicleType, EngineType engineType, int horsepower, double engineCapacity) {
        this.name = name;
        this.area = area;
        this.vehicleType = vehicleType;
        this.engineType = engineType;
        this.horsepower = horsepower;
        this.engineCapacity = engineCapacity;
    }

}
