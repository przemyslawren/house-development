package pl.housedevelopment.apartment;
import pl.housedevelopment.interfaces.TenantAction;
import pl.housedevelopment.person.Person;
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
        StringBuilder sb = new StringBuilder();
        sb.append("Apartment ID: ").append(id).append("\n");
        sb.append("Area: ").append(String.format("%.2f", area)).append(" sqm\n");
        sb.append("Tenants:\n");

        for (Tenant tenant : tenants) {
            if (tenant.getMainTenant()) {
                sb.append(" - Main Tenant").append("\n");
                sb.append("   Full Name: ").append(tenant.getName()).append(" ").append(tenant.getSurname()).append("\n");
            } else {
                sb.append(" - Tenant").append("\n");
                sb.append("   Full Name: ").append(tenant.getName()).append(" ").append(tenant.getSurname()).append("\n");
            }
            sb.append("   PersonalID: ").append(tenant.getPersonalId()).append("\n");
            sb.append("   Address: ").append(tenant.getAddress()).append("\n");
            sb.append("   Date of Birth: ").append(tenant.getDateOfBirth()).append("\n\n");
        }

        return sb.toString();
    }
}
