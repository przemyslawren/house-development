package pl.housedevelopment.person;

public class Address {

    private String street;
    private String houseNumber;
    private String postalCode;
    private String city;

    public Address(String street, String houseNumber, String postalCode, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String toString() {
        return street + " " + houseNumber  + ", " + postalCode + " " + city;
    }
}
