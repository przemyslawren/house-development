package pl.housedevelopment.person;

import pl.housedevelopment.TenantLetter;

import java.util.ArrayList;
import java.util.List;

public class Tenant extends Person {
    private boolean isPrimaryTenant;
    List<TenantLetter> tenantLetters;
    public Tenant(String name, String surname, int personalIDNumber, String address, String dateOfBirth) {
        super(name, surname, personalIDNumber, address, dateOfBirth);
        this.isPrimaryTenant = false;
        this.tenantLetters = new ArrayList<>();
    }

    public boolean isPrimaryTenant() {
        return isPrimaryTenant;
    }

    public void setPrimaryTenant(boolean primaryTenant) {
        isPrimaryTenant = primaryTenant;
    }

    public String toString() {
        return "\nTenant: " + super.toString() + "," + tenantLetters;
    }

    public void addTenantLetter(TenantLetter tenantLetter) {
        this.tenantLetters.add(tenantLetter);
    }

    public void removeTenantLetter(TenantLetter tenantLetter) {
        this.tenantLetters.remove(tenantLetter);
    }

    public List<TenantLetter> getTenantLetters() {
        return this.tenantLetters;
    }

}
