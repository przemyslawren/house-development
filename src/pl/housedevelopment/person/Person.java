package pl.housedevelopment.person;

import pl.housedevelopment.TenantLetter;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private boolean isTenant;
    List<TenantLetter> tenantLetters;
    final private String name;
    final private String surname;
    final private int personalIDNumber;
    private String address;
    final private String dateOfBirth;

    public Person(String name, String surname, int personalIDNumber, String address, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.personalIDNumber = personalIDNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.isTenant = false;
        this.tenantLetters = new ArrayList<>();
    }

    public void setTenant() {
        isTenant = true;
    }

    public boolean isTenant() {
        return isTenant;
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
