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
        Apartment apartment1 = new Apartment(152.30);
        Apartment apartment2 = new Apartment(152.30);
        Apartment apartment3 = new Apartment(152.30);
        Apartment apartment4 = new Apartment(152.30);

        Tenant tenant = new Tenant("Lukas", "Kowalski", 123456789, address, "1999-01-01");
        apartment.addTenant(tenant);
        System.out.println(tenant.toString());
    }

    public static void mainMenu() {
//        textMenu();
    }

    public static void textMenu() {
        System.out.println("a: Wyświetl wszystkie apartamenty");
        System.out.println("p: Wyświetl wszystkie parkingi");
        System.out.println("o: Wyświetl wszystkie osoby");
        System.out.println("?: Powrót do menu");
        System.out.println("q: Aby zakończyć działanie programu");
    }
}