package pl.housedevelopment.person;

public class Address {

    private String street;
    private String houseNumber;
    private String flatNumber;
    private String postalCode;
    private String city;

    public Address(String street, String houseNumber, String flatNumber, String postalCode, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String toString() {
        return street + " " + houseNumber + "/" + flatNumber + ", " + postalCode + " " + city;
    }
}
