package pl.housedevelopment.apartment;
import pl.housedevelopment.person.Person;

import java.util.ArrayList;
import java.util.List;

public class Apartment extends Property {

    private List<Person> tenants;

    public Apartment(double area) {
        super(area);
        this.tenants = new ArrayList<>();
    }

    public Apartment(double length, double width, double height) {
        super(length * width * height);
    }

    public String toString() {
        return "\nApartment:" + tenants +
                ", " + area;
    }
}
