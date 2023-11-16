package pl.housedevelopment.apartment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        return "Block{" + apartments + ", " + parkingSpaces + '}';
    }

}
