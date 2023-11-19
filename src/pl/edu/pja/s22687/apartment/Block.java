package pl.edu.pja.s22687.apartment;

import java.util.LinkedList;
import java.util.List;

public class Block {
    Estate estate;
    LinkedList<Apartment> apartments;
    List<ParkingSpace> parkingSpaces;

    public Block(LinkedList<Apartment> apartments, List<ParkingSpace> parkingSpaces, Estate estate) {
        this.apartments = apartments;
        this.parkingSpaces = parkingSpaces;
        this.estate = estate;
    }

    public String toString() {
        return "Block {" + apartments + ", " + parkingSpaces + '}';
    }

}
