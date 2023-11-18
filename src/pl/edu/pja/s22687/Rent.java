package pl.edu.pja.s22687;

import pl.edu.pja.s22687.apartment.Apartment;
import pl.edu.pja.s22687.apartment.ParkingSpace;
import pl.edu.pja.s22687.apartment.Property;

import java.util.ArrayList;

public class Rent {
    private static ArrayList<Property> listOfRents = new ArrayList<>();

    public static ArrayList<Property> getListOfRents() {
        return listOfRents;
    }

    public static void addToListOfRents(Apartment apartment) {
        getListOfRents().add(apartment);
    }

    public static void addToListOfRents(ParkingSpace parkingSpace) {
        getListOfRents().add(parkingSpace);
    }

    public enum RentStatus {
        VALID, CANCELLED, EXPIRED, RENEWED
    }

}

