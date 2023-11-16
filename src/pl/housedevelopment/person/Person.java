package pl.housedevelopment.person;

public class Person {
    protected String name;
    protected String surname;
    final protected int personalId;
    protected Address address;
    protected String dateOfBirth;

    public Person(String name, String surname, int personalId, Address address, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.personalId = personalId;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return  name + " " + surname + ", " + personalId + ", " + address + ", " + dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersonalId() {
        return String.valueOf(personalId);
    }

    public String getAddress() {
        return address.toString();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
