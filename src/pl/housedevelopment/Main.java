package pl.housedevelopment;
import pl.housedevelopment.apartment.Apartment;
import pl.housedevelopment.apartment.Block;
import pl.housedevelopment.apartment.ParkingSpace;
import pl.housedevelopment.apartment.Property;
import pl.housedevelopment.person.Address;
import pl.housedevelopment.person.Developer;
import pl.housedevelopment.person.Tenant;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        startClock();
        startingData();
        mainMenu();
    }
    public static void startClock() {

    }
    //entry data to the program
    public static void startingData() {
        Developer developer = Developer.getInstance();
        LinkedList<Block> blocks = new LinkedList<>();
        Address address = new Address("Redutowa", "130", "01-106", "Warsaw");




        Apartment apartment = new Apartment(152.30);

    }

    public static void mainMenu() {

    }

    public static void textMenu() {

    }
}