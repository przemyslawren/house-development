package pl.housedevelopment.apartment;

import pl.housedevelopment.person.Tenant;

public class ParkingSpace extends Property {
    private Tenant tenant;
    public ParkingSpace(double area) {
        super(area);
        this.tenant = null;
    }

    public boolean addTenant(Tenant tenant) {
        if (this.tenant == null) {
            this.tenant = tenant;
            return true;
        } else {
            return false;
        }
    }
}
