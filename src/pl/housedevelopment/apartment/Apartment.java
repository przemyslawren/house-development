package pl.housedevelopment.apartment;
import pl.housedevelopment.person.Person;

import java.util.ArrayList;
import java.util.List;

public class Apartment {

    private int id;
    private List<Person> tenants;
    private static final int MAX_TENANTS = 5;
    private double volume;

    public Apartment(double volume) {
        this.volume = volume;
        this.tenants = new ArrayList<>();
    }

    public Apartment(double length, double width, double height) {
        this(length * width * height);
    }


//    private int generateId() {
//        return (System.nanoTime()).hashCode();
//    }

    public int getId() {
        return this.id;
    }

    public double getVolume() {
        return this.volume;
    }

    public void addTenant(Person tenant) {
        if (tenants.isEmpty()) {
            tenant.setPrimaryTenant(true);
        }

        this.tenants.add(tenant);
    }

    public void removeTenant(Person tenant) {
        this.tenants.remove(tenant);
    }

    public List<Person> getTenants() {
        return this.tenants;
    }

    public String toString() {
        return "\nApartment:" + tenants +
                ", " + volume;
    }
}
