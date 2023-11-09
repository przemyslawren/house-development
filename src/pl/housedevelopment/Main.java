package pl.housedevelopment;

import pl.housedevelopment.apartment.Apartment;
import pl.housedevelopment.apartment.ApartmentBlock;
import pl.housedevelopment.apartment.Estate;
import pl.housedevelopment.person.Person;

public class Main {
    public static void main(String[] args) {

        Person tenant1 = new Person("Jan", "Kowalski", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Person tenant2 = new Person("Małgorzata", "Kowalska", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Person tenant3 = new Person("Adam", "Nowak", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Person tenant4 = new Person("Marysia", "Nowakowska", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Person tenant5 = new Person("Zuzia", "Szurnięta", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Person tenant6 = new Person("Marek", "Szurniety", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Person tenant7 = new Person("Wiktoria", "Schulz", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Person tenant8 = new Person("Maximilian", "Schulz", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Person tenant9 = new Person("Elias", "Schulz", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");
        Person tenant10 = new Person("Mariusz", "Dureń", 123456789, "Królowej Jadwigi 10/1", "01.01.1990");

        Apartment apartment1 = new Apartment(50);
        Apartment apartment69 = new Apartment(10,20,30);
            apartment1.addTenant(tenant1);
            apartment1.addTenant(tenant2);

        Apartment apartment2 = new Apartment(40);
            apartment2.addTenant(tenant3);
            apartment2.addTenant(tenant4);

        Apartment apartment3 = new Apartment(60);
            apartment3.addTenant(tenant5);
            apartment3.addTenant(tenant6);

        Apartment apartment4 = new Apartment(1200);
            apartment4.addTenant(tenant7);
            apartment4.addTenant(tenant8);
            apartment4.addTenant(tenant9);

        Apartment apartment5 = new Apartment(30,20,2.5);
            apartment5.addTenant(tenant10);

        ApartmentBlock apartmentBlock1 = new ApartmentBlock();
            apartmentBlock1.addApartment(apartment1);
            apartmentBlock1.addApartment(apartment2);
            apartmentBlock1.addApartment(apartment3);
            apartmentBlock1.addApartment(apartment4);
            apartmentBlock1.addApartment(apartment5);

        Estate estate1 = new Estate();
            estate1.addApartmentBlock(apartmentBlock1);

        System.out.println(apartment5.getVolume());
    }
}