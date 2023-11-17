package pl.edu.pja.s22687.person;

public class Person {
    private String name;
    private String surname;
    final protected String personalId;
    private Address address;
    private String dateOfBirth;

    public Person(String name, String surname, String personalId, Address address, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.personalId = personalId;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return name + " " + surname + ", " + personalId + ", " + address + ", " + dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersonalId() {
        return personalId;
    }

    public String getAddress() {
        return address.toString();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
