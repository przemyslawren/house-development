package pl.edu.pja.s22687;
import pl.edu.pja.s22687.apartment.Estate;
import pl.edu.pja.s22687.apartment.ParkingSpace;
import pl.edu.pja.s22687.exceptions.ProblematicTenantException;
import pl.edu.pja.s22687.person.Address;
import pl.edu.pja.s22687.person.Developer;
import pl.edu.pja.s22687.apartment.Apartment;
import pl.edu.pja.s22687.apartment.Block;
import pl.edu.pja.s22687.person.Tenant;
import pl.edu.pja.s22687.utilities.ChangeDate;
import pl.edu.pja.s22687.utilities.SharedDate;
import pl.edu.pja.s22687.utilities.CheckRent;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ProblematicTenantException {
        startClock();
        mainMenu();
    }
    public static void startClock() {
        SharedDate sharedDate = SharedDate.getInstance();
        Thread dateThread = new Thread(new ChangeDate(sharedDate));
        Thread rentThread = new Thread(new CheckRent(sharedDate));

        dateThread.start();
        rentThread.start();
    }

    public static void mainMenu() throws ProblematicTenantException {
        Developer developer = Developer.getInstance();
        LinkedList<Block> blockLinkedList = new LinkedList<>();
        File storedData = new File("data.txt");
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
        ParkingSpace p2 = new ParkingSpace(50);
        ParkingSpace p3 = new ParkingSpace(70);
        ParkingSpace p4 = new ParkingSpace(40);
        ParkingSpace p5 = new ParkingSpace(5,3,2);

        LinkedList<ParkingSpace> parkingSpaceLinkedList = new LinkedList<>();
        parkingSpaceLinkedList.add(p1);
        parkingSpaceLinkedList.add(p2);
        parkingSpaceLinkedList.add(p3);
        parkingSpaceLinkedList.add(p4);
        parkingSpaceLinkedList.add(p5);

        Tenant t1 = new Tenant("Lukas", "Kowalski", "82060369697", address, "1982-01-01"); //tenant with apartment
        Tenant t2 = new Tenant("Krzysztof", "Nowak", "54012716468", address, "1954-07-05"); //tenant with apartment
        Tenant t3 = new Tenant("Andreas", "Muller", "80052331488", address, "1990-12-13"); //tenant with apartment
        Tenant t4 = new Tenant("Barbara", "SchwarzMuller", "67112731899", address, "1967-05-08"); //tenant with apartment
        Tenant t5 = new Tenant("Max", "Smith", "99030537275", address, "1999-09-09"); //tenant with apartment
        Tenant t6 = new Tenant("a", "Kowalski", "82060369697", address, "1982-01-01"); //tenant without apartment
        Tenant t7 = new Tenant("b", "Kowalski", "54012716468", address, "1954-07-05"); //tenant without apartment
        Tenant t8 = new Tenant("c", "Muller", "80052331488", address, "1990-12-13"); //tenant without apartment
        Tenant t9 = new Tenant("d", "Muller", "67112731899", address, "1967-05-08"); //tenant without apartment
        Tenant t10 = new Tenant("e", "Muller", "99030537275", address, "1999-09-09"); //tenant without apartment

        ArrayList<Tenant> tenantList = new ArrayList<>();
        tenantList.add(t1);
        tenantList.add(t2);
        tenantList.add(t3);
        tenantList.add(t4);
        tenantList.add(t5);

        t1.rent(a1,1);
        t2.rent(a2,2);
        t3.rent(a3,3);
        t4.rent(a4,4);
        t5.rent(a5,5);

        Estate estate = new Estate(developer, blockLinkedList);
        Block block = new Block(apartmentLinkedList, parkingSpaceLinkedList, estate);
        blockLinkedList.add(block);


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
                case "s":
                    System.out.println("Save the data to a file");
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
        System.out.println("a: Show all the apartments");
        System.out.println("p: Show all the parking spaces");
        System.out.println("o: Show all the persons");
        System.out.println("t: Manage the tenants"); //todo pick a main tenant and make it possible to remove others or add new ones
        System.out.println("s: Save the data to a file"); //todo
        System.out.println("m: Show the menu");
        System.out.println("q: Finish the program");
    }

    public static void seeMenu() {
        System.out.println("m: Show the menu");
    }
}