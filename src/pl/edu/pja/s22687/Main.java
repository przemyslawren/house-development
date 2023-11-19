package pl.edu.pja.s22687;
import pl.edu.pja.s22687.apartment.*;
import pl.edu.pja.s22687.exceptions.ProblematicTenantException;
import pl.edu.pja.s22687.exceptions.TooManyThingsException;
import pl.edu.pja.s22687.person.Address;
import pl.edu.pja.s22687.person.Developer;
import pl.edu.pja.s22687.person.Tenant;
import pl.edu.pja.s22687.utilities.DateAndRentManager;
import pl.edu.pja.s22687.utilities.ParkingSpaceManager;
import pl.edu.pja.s22687.utilities.SharedDate;
import pl.edu.pja.s22687.utilities.TenantManager;
import pl.edu.pja.s22687.vehicle.*;

import java.io.File;
import java.time.LocalDate;
import java.util.*;

public class Main {
    private static DateAndRentManager dateAndRentManager;
    public static void main(String[] args) throws ProblematicTenantException, TooManyThingsException {
        startClock(TenantManager.getAllTenants());
        mainMenu();
    }
    public static void startClock(List<Tenant> allTenants) {
        SharedDate sharedDate = SharedDate.getInstance();
        dateAndRentManager = new DateAndRentManager(sharedDate, allTenants);
        Thread managerThread = new Thread(dateAndRentManager);
        managerThread.start();
    }

    public static void mainMenu() throws ProblematicTenantException, TooManyThingsException {
        Developer developer = Developer.getInstance();
        TenantManager tenantManager = new TenantManager();
        ParkingSpaceManager parkingSpaceManager = new ParkingSpaceManager();
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

        parkingSpaceManager.addParkingSpace(p1);
        parkingSpaceManager.addParkingSpace(p2);
        parkingSpaceManager.addParkingSpace(p3);
        parkingSpaceManager.addParkingSpace(p4);
        parkingSpaceManager.addParkingSpace(p5);

        CityVehicle c1 = new CityVehicle("BMW", 10, VehicleType.CITY, EngineType.DIESEL, 200, 2.0,5);
        MotorcycleVehicle m1 = new MotorcycleVehicle("Yamaha", 5, VehicleType.MOTORCYCLE, EngineType.PETROL, 150, 1.0, 300);
        CityVehicle c2 = new CityVehicle("Audi", 15, VehicleType.CITY, EngineType.ELECTRIC, 300, 3.0, 4);
        MotorcycleVehicle m2 = new MotorcycleVehicle("Honda", 7, VehicleType.MOTORCYCLE, EngineType.HYBRID, 250, 1.5, 250);
        CityVehicle c3 = new CityVehicle("Mercedes", 20, VehicleType.CITY, EngineType.DIESEL, 400, 4.0, 3);

        Item i1 = new Item("Bike", 2);

        p1.addItem(c1);
        p1.addItem(m1);
        p2.addItem(c2);
        p3.addItem(m2);
        p4.addItem(c3);

        p1.addItem(i1);


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

        tenantManager.addTenant(t1);
        tenantManager.addTenant(t2);
        tenantManager.addTenant(t3);
        tenantManager.addTenant(t4);
        tenantManager.addTenant(t5);

        t1.rent(a1,1);
        t1.rent(a2,2);
        t3.rent(a3,3);
        t4.rent(a4,4);
        t5.rent(a5,5);

        Estate estate = new Estate(developer, blockLinkedList);
        Block block = new Block(apartmentLinkedList,parkingSpaceManager.getAllParkingSpaces(), estate);
        blockLinkedList.add(block);


        textMenu();
        String choice;
        Scanner scanner = new Scanner(System.in);
        do {
            choice = scanner.nextLine();
            switch (choice) {
                case "c":
                    if (dateAndRentManager != null) {
                        dateAndRentManager.toggleRentChecking();
                    }
                    break;

                case "a":
                    System.out.println("Show all the apartments");
                        for (Apartment apartment : apartmentLinkedList) {
                            System.out.println(apartment);
                        }
                        seeMenu();
                    break;
                case "p":
                    System.out.println("Show all the parking spaces");
                        for (ParkingSpace parkingSpace : parkingSpaceManager.getAllParkingSpaces()) {
                            System.out.println(parkingSpace);
                        }
                        seeMenu();
                    break;
                case "o":
                    System.out.println("Show all the persons");
                        for (Tenant tenant : TenantManager.getAllTenants()) {
                            System.out.println(tenant);
                        }
                        seeMenu();
                    break;
                case "i":
                    System.out.println("Insert a new item to the parking space");
                    System.out.println("Enter the ID of the parking space");

                        System.out.println("Item added");
                        seeMenu();
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
        System.out.println("c: Check rents ON/OFF");
        System.out.println("a: Show all the apartments");
        System.out.println("p: Show all the parking spaces");
        System.out.println("o: Show all the persons");
        System.out.println("i: Insert a new item to the parking space");
        System.out.println("s: Save the data to a file");
        System.out.println("m: Show the menu");
        System.out.println("q: Finish the program");
    }

    public static void seeMenu() {
        System.out.println("m: Show the menu");
    }
}