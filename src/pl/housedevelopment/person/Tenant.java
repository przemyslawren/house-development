package pl.housedevelopment.person;

import pl.housedevelopment.TenantLetter;
import pl.housedevelopment.apartment.Apartment;

import java.util.ArrayList;
import java.util.List;

public class Tenant extends Person {
    private boolean isMainTenant;
    List<TenantLetter> tenantLetters;
    public Tenant(String name, String surname, String personalIDNumber, Address address, String dateOfBirth) {
        super(name, surname, personalIDNumber, address, dateOfBirth);
        this.isMainTenant = false;
        this.tenantLetters = new ArrayList<>();
    }

    public void setMainTenant(boolean isMainTenant) {
        this.isMainTenant = isMainTenant;
    }

    public boolean getMainTenant() {
        return isMainTenant;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getMainTenant()) {
            sb.append(" - Main Tenant").append("\n");
            sb.append("   Full Name: ").append(getName()).append(" ").append(getSurname()).append("\n");
        } else {
            sb.append(" - Tenant").append("\n");
            sb.append("   Full Name: ").append(getName()).append(" ").append(getSurname()).append("\n");
        }
        sb.append("   PersonalID: ").append(getPersonalId()).append("\n");
        sb.append("   Address: ").append(getAddress()).append("\n");
        sb.append("   Date of Birth: ").append(getDateOfBirth()).append("\n\n");
        return sb.toString();
    }
}
