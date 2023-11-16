package pl.housedevelopment.apartment;
import pl.housedevelopment.interfaces.TenantAction;
import pl.housedevelopment.person.Tenant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Apartment extends Property implements TenantAction {

    private Tenant mainTenant;
    ParkingSpace parkingSpace;
    private List<Tenant> tenants;
    private LocalDate startRent;
    private LocalDate endRent;

    public Apartment(double area) {
        super(area);
        this.tenants = new ArrayList<>();
    }

    public Apartment(double length, double width, double height) {
        super(length * width * height);
    }

    public void addTenant(Tenant tenant) {
        if (mainTenant == null) {
            tenant.setMainTenant(true);
            this.mainTenant = tenant;
            this.tenants.add(tenant);
        } else {
            this.tenants.add(tenant);
        }
    }

    public String toString() {
        return "\nApartment:" + tenants +
                ", " + area;
    }
}
