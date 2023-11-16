package pl.housedevelopment.person;

import pl.housedevelopment.TenantLetter;

import java.util.ArrayList;
import java.util.List;

public class Tenant extends Person {
    private boolean isMainTenant;
    List<TenantLetter> tenantLetters;
    public Tenant(String name, String surname, int personalIDNumber, Address address, String dateOfBirth) {
        super(name, surname, personalIDNumber, address, dateOfBirth);
        this.isMainTenant = false;
        this.tenantLetters = new ArrayList<>();
    }

    public void setMainTenant(boolean isMainTenant) {
        this.isMainTenant = isMainTenant;
    }

    public String toString() {
        return "\nTenant: " + super.toString() + "," + tenantLetters;
    }

}
