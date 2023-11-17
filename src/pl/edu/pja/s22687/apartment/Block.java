package pl.edu.pja.s22687.apartment;

import java.util.LinkedList;

public class Block {
    Estate estate;
    LinkedList<Apartment> apartments;
    LinkedList<ParkingSpace> parkingSpaces;

    public Block(LinkedList<Apartment> apartments, LinkedList<ParkingSpace> parkingSpaces, Estate estate) {
        this.apartments = apartments;
        this.parkingSpaces = parkingSpaces;
        this.estate = estate;
    }

    public String toString() {
        return "Block {" + apartments + ", " + parkingSpaces + '}';
    }

}
