package pl.housedevelopment.apartment;

import java.util.ArrayList;
import java.util.List;

public class ApartmentBlock {
    List<Apartment> apartments;

    public ApartmentBlock() {
        this.apartments = new ArrayList<>();
    }

    public String toString() {
        return "\nApartmentBlock: " + apartments;
    }

    public void addApartment(Apartment apartment) {
        this.apartments.add(apartment);
    }

    public void removeApartment(Apartment apartment) {
        this.apartments.remove(apartment);
    }

    public List<Apartment> getApartments() {
        return this.apartments;
    }
}
