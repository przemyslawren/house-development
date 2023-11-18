package pl.edu.pja.s22687.apartment;

import pl.edu.pja.s22687.interfaces.TenantAction;
import pl.edu.pja.s22687.person.Tenant;

import java.time.LocalDate;
import java.util.List;

public class ParkingSpace extends Property implements TenantAction {
    private Tenant mainTenant;
    private List<Tenant> items;
    public ParkingSpace(double area) {
        super(area);
    }

    public ParkingSpace(double length, double width, double height) {
        super(length * width * height);
    }


    public void addTenant(Tenant tenant) {
        if (this.mainTenant == null) {
            tenant.setMainTenant(true);
            this.mainTenant = tenant;
        } else {
            System.out.println("Parking space is already taken");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parking Space ID: ").append(id).append("\n");
        sb.append("Area: ").append(String.format("%.2f", area)).append(" sqm\n");
        if (mainTenant == null) {
            sb.append(" - No tenants\n");
        } else {
            sb.append(" - Main Tenant").append("\n");
            sb.append("   Full Name: ").append(mainTenant.getName()).append(" ").append(mainTenant.getSurname()).append("\n");
        }
        return sb.toString();
    }
}
