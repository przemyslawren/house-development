package pl.housedevelopment.apartment;
import pl.housedevelopment.person.Tenant;

import java.util.ArrayList;
import java.util.List;

public class Apartment extends Property {

    ParkingSpace parkingSpace;
    private List<Tenant> tenants;

    public Apartment(double area) {
        super(area);
        this.tenants = new ArrayList<>();
    }

    public Apartment(double length, double width, double height) {
        super(length * width * height);
    }

    public void addTenant(Tenant tenant) {
        this.tenants.add(tenant);
    }

    public String toString() {
        return "\nApartment:" + tenants +
                ", " + area;
    }
}
