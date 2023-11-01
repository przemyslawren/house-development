import java.util.List;

public class ApartmentBlock {
    List<Apartment> apartments;

    public ApartmentBlock(List<Apartment> apartments) {
        this.apartments = apartments;
    }

    public String toString() {
        return "ApartmentBlock: " + apartments;
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
