package pl.edu.pja.s22687.utilities;

import pl.edu.pja.s22687.apartment.ParkingSpace;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpaceManager {
    private static List<ParkingSpace> parkingSpaces;

    public ParkingSpaceManager() {
        parkingSpaces = new ArrayList<>();
    }

    public void addParkingSpace(ParkingSpace parkingSpace) {
        parkingSpaces.add(parkingSpace);
    }

    public void removeParkingSpace(ParkingSpace parkingSpace) {
        parkingSpaces.remove(parkingSpace);
    }

    public List<ParkingSpace> getAllParkingSpaces() {
        return parkingSpaces;
    }
}
