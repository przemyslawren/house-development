package pl.housedevelopment.person;

public class Person {
    private String name;
    private String surname;
    private int personalIDNumber;
    private String address;
    private String dateOfBirth;

    public Person(String name, String surname, int personalIDNumber, String address, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.personalIDNumber = personalIDNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return  name + " " + surname + ", " + personalIDNumber + ", " + address + ", " + dateOfBirth;
    }
}
