package pl.housedevelopment.apartment;

import pl.housedevelopment.interfaces.TenantAction;
import pl.housedevelopment.person.Tenant;

public class ParkingSpace extends Property implements TenantAction {
    private Tenant mainTenant;
    public ParkingSpace(double area) {
        super(area);
    }

    public void addTenant(Tenant tenant) {
        if (this.mainTenant == null) {
            tenant.setMainTenant(true);
            this.mainTenant = tenant;
        } else {
            System.out.println("Parking space is already taken");
        }
    }
}
