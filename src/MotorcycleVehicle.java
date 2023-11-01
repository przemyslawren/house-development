public class MotorcycleVehicle extends Vehicle {
    double maxSpeed;

    public MotorcycleVehicle(String name, double surfaceArea, VehicleType vehicleType, EngineType engineType, int horsepower, double engineCapacity, double maxSpeed) {
        super(name, surfaceArea, vehicleType, engineType, horsepower, engineCapacity);
        this.maxSpeed = maxSpeed;
    }
}
