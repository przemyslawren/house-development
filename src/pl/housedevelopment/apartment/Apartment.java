package pl.housedevelopment.apartment;
import pl.housedevelopment.person.Tenant;

import java.util.ArrayList;
import java.util.List;

public class Apartment extends Property {

    private List<Tenant> tenants;

    public Apartment(double area) {
        super(area);
        this.tenants = new ArrayList<>();
    }

    public Apartment(double length, double width, double height) {
        super(length * width * height);
    }

    public boolean addTenant(Tenant tenant) {
        if (tenants.isEmpty()) {
            tenants.add(tenant);
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "\nApartment:" + tenants +
                ", " + area;
    }
}
