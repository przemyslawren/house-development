package pl.housedevelopment;
import pl.housedevelopment.apartment.Apartment;
import pl.housedevelopment.apartment.Block;
import pl.housedevelopment.apartment.ParkingSpace;
import pl.housedevelopment.apartment.Property;
import pl.housedevelopment.person.Address;
import pl.housedevelopment.person.Developer;
import pl.housedevelopment.person.Tenant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startClock();
        mainMenu();
    }
    public static void startClock() {

    }

    public static void mainMenu() {
        Developer developer = Developer.getInstance();
        LinkedList<Block> blockLinkedList = new LinkedList<>();
        Address address = new Address("Redutowa", "130", "01-106", "Warsaw");

        Apartment a1 = new Apartment(152.30);
        Apartment a2 = new Apartment(221.50);
        Apartment a3 = new Apartment(50.25);
        Apartment a4 = new Apartment(200);
        Apartment a5 = new Apartment(12,13,2);

        LinkedList<Apartment> apartmentLinkedList = new LinkedList<>();
        apartmentLinkedList.add(a1);
        apartmentLinkedList.add(a2);
        apartmentLinkedList.add(a3);
        apartmentLinkedList.add(a4);
        apartmentLinkedList.add(a5);

        ParkingSpace p1 = new ParkingSpace(30);
        ParkingSpace p2 = new ParkingSpace(30);
        ParkingSpace p3 = new ParkingSpace(30);
        ParkingSpace p4 = new ParkingSpace(30);
        ParkingSpace p5 = new ParkingSpace(5,3,2);

        LinkedList<ParkingSpace> parkingSpaceLinkedList = new LinkedList<>();
        parkingSpaceLinkedList.add(p1);
        parkingSpaceLinkedList.add(p2);
        parkingSpaceLinkedList.add(p3);
        parkingSpaceLinkedList.add(p4);
        parkingSpaceLinkedList.add(p5);

        Tenant t1 = new Tenant("Lukas", "Kowalski", "82060369697", address, "1982-01-01");
        Tenant t2 = new Tenant("Krzysztof", "Kowalski", "54012716468", address, "1954-07-05");
        Tenant t3 = new Tenant("Andreas", "Muller", "80052331488", address, "1990-12-13");
        Tenant t4 = new Tenant("Barbara", "Muller", "67112731899", address, "1967-05-08");
        Tenant t5 = new Tenant("Max", "Muller", "99030537275", address, "1999-09-09");

        ArrayList<Tenant> tenantList = new ArrayList<>();
        tenantList.add(t1);
        tenantList.add(t2);
        tenantList.add(t3);
        tenantList.add(t4);
        tenantList.add(t5);

        a1.addTenant(t1);
        a1.addTenant(t2);
        a2.addTenant(t3);
        a2.addTenant(t4);
        a2.addTenant(t5);
        textMenu();
        String choice;
        Scanner scanner = new Scanner(System.in);
        do {
            choice = scanner.nextLine();
            switch (choice) {
                case "a":
                    System.out.println("Show all the apartments");
                        for (Apartment apartment : apartmentLinkedList) {
                            System.out.println(apartment);
                        }
                        seeMenu();
                    break;
                case "p":
                    System.out.println("Show all the parking spaces");
                        for (ParkingSpace parkingSpace : parkingSpaceLinkedList) {
                            System.out.println(parkingSpace);
                        }
                        seeMenu();
                    break;
                case "o":
                    System.out.println("Show all the persons");
                        for (Tenant tenant : tenantList) {
                            System.out.println(tenant);
                        }
                        seeMenu();
                    break;
                case "m":
                    textMenu();
                    break;
                case "q":
                    System.out.println("Finishing the program");
                    break;
                default:
                    System.out.println("No such option, try again");
                    break;
            }
        } while (!choice.equals("q"));
    }

    public static void textMenu() {
        System.out.println("c: Check in a person");
        System.out.println("a: Show all the apartments");
        System.out.println("p: Show all the parking spaces");
        System.out.println("o: Show all the persons");
        System.out.println("m: Show the menu");
        System.out.println("q: Finish the program");
    }

    public static void seeMenu() {
        System.out.println("m: Show the menu");
    }
}