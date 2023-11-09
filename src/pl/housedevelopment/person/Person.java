package pl.housedevelopment.person;

import pl.housedevelopment.TenantLetter;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private boolean isPrimaryTenant;
    List<TenantLetter> tenantLetters;
    private String name;
    private String surname;
    private int personalIDNumber;
    private String address;
    private String dateOfBirth;

    public Person(String name, String surname, int personalIDNumber, String address, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.personalIDNumber = personalIDNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.isPrimaryTenant = false;
        this.tenantLetters = new ArrayList<>();
    }

    public boolean isPrimaryTenant() {
        return isPrimaryTenant;
    }

    public void setPrimaryTenant(boolean primaryTenant) {
        isPrimaryTenant = primaryTenant;
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

    public String toString() {
        return  name + " " + surname + ", " + personalIDNumber + ", " + address + ", " + dateOfBirth;
    }
}
