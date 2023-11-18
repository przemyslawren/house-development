package pl.edu.pja.s22687.apartment;

import pl.edu.pja.s22687.Rent;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Property {
    private LocalDate startRent;
    private LocalDate endRent;
    public Rent.RentStatus status;
    protected static int nextId = 1; //static variable that holds next id to be assigned
    protected int id;
    protected double area;
    protected static Map<Integer, Property> properties = new HashMap<>();


    public Property(double area) {
        this.id = nextId;
        properties.put(this.id, this);
        nextId++;
        this.area = area;
    }

    public static String checkPropertyTypeByID(int id) {
        if (properties.get(id) instanceof Apartment) {
            return "Apartment";
        } else if (properties.get(id) instanceof ParkingSpace) {
            return "ParkingSpace";
        } else {
            return "Property";
        }
    }

    public LocalDate getStartRent() {
        return startRent;
    }

    public void setStartRent(LocalDate startRent) {
        this.startRent = startRent;
    }

    public LocalDate getEndRent() {
        return endRent;
    }

    public void setEndRent(LocalDate endRent) {
        this.endRent = endRent;
    }

    public void setRentStatus(Rent.RentStatus rentStatus) {

    }

    public String toString() {
        return "Property{" + "id=" + id + ", area=" + area + '}';
    }

    public boolean getRentStatus() {
        return false;
    }
}
