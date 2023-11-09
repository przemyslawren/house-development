package pl.housedevelopment.apartment;

import pl.housedevelopment.person.Tenant;

import java.util.ArrayList;
import java.util.List;

public class Apartment {


    private List<Tenant> tenants;
    private double area;
    private String startDate;
    private String endDate;

    public Apartment(double area, String startDate, String endDate) {
        this.area = area;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tenants = new ArrayList<>();
    }

    public String toString() {
        return "\nApartment:" + tenants +
                ", " + area + ", " + startDate + ", " + endDate;
    }

    public void addTenant(Tenant tenant) {
        if (tenants.isEmpty()) {
            tenant.setPrimaryTenant(true);
        }
        this.tenants.add(tenant);
    }

    public void removeTenant(Tenant tenant) {
        this.tenants.remove(tenant);
    }

    public List<Tenant> getTenants() {
        return this.tenants;
    }
}
