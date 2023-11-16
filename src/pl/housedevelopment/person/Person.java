package pl.housedevelopment.person;

import pl.housedevelopment.TenantLetter;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String surname;
    final private int personalID;
    private Address address;
    private String dateOfBirth;

    public Person(String name, String surname, int personalID, Address address, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.personalID = personalID;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return  name + " " + surname + ", " + personalID + ", " + address + ", " + dateOfBirth;
    }
}
