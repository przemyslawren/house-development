public class OffroadVehicle extends Vehicle {
    private double loadCapacity;

    public OffroadVehicle(String name, double surfaceArea, VehicleType vehicleType, EngineType engineType, int horsepower, double engineCapacity, double loadCapacity) {
        super(name, surfaceArea, vehicleType, engineType, horsepower, engineCapacity);
        this.loadCapacity = loadCapacity;
    }
}
