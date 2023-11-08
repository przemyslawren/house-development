package pl.housedevelopment;

import pl.housedevelopment.apartment.Apartment;
import pl.housedevelopment.apartment.ApartmentBlock;
import pl.housedevelopment.apartment.Estate;
import pl.housedevelopment.person.Person;
import pl.housedevelopment.person.Tenant;
import pl.housedevelopment.vehicle.AmphibiousVehicle;
import pl.housedevelopment.vehicle.EngineType;
import pl.housedevelopment.vehicle.VehicleType;

public class Main {
    public static void main(String[] args) {

        Tenant tenant1 = new Tenant("Jan", "Kowalski", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Tenant tenant2 = new Tenant("Małgorzata", "Kowalska", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Tenant tenant3 = new Tenant("Adam", "Nowak", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Tenant tenant4 = new Tenant("Marysia", "Nowakowska", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Tenant tenant5 = new Tenant("Zuzia", "Szurnięta", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Tenant tenant6 = new Tenant("Marek", "Szurniety", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Tenant tenant7 = new Tenant("Wiktoria", "Schulz", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Tenant tenant8 = new Tenant("Maximilian", "Schulz", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Tenant tenant9 = new Tenant("Elias", "Schulz", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Tenant tenant10 = new Tenant("Mariusz", "Dureń", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");

        Apartment apartment1 = new Apartment(50, "01.01.2020", "01.01.2021");
            apartment1.addTenant(tenant1);
            apartment1.addTenant(tenant2);

        Apartment apartment2 = new Apartment(40, "01.01.2020", "01.01.2021");
            apartment2.addTenant(tenant3);
            apartment2.addTenant(tenant4);

        Apartment apartment3 = new Apartment(60, "01.01.2020", "01.01.2021");
            apartment3.addTenant(tenant5);
            apartment3.addTenant(tenant6);

        Apartment apartment4 = new Apartment(70, "01.01.2020", "01.01.2021");
            apartment4.addTenant(tenant7);
            apartment4.addTenant(tenant8);
            apartment4.addTenant(tenant9);

        Apartment apartment5 = new Apartment(30, "01.01.2020", "01.01.2021");
            apartment5.addTenant(tenant10);

        ApartmentBlock apartmentBlock1 = new ApartmentBlock();
            apartmentBlock1.addApartment(apartment1);
            apartmentBlock1.addApartment(apartment2);
            apartmentBlock1.addApartment(apartment3);
            apartmentBlock1.addApartment(apartment4);
            apartmentBlock1.addApartment(apartment5);

        Estate estate1 = new Estate();
            estate1.addApartmentBlock(apartmentBlock1);

        System.out.println(estate1.getApartmentBlocks());

    }
}