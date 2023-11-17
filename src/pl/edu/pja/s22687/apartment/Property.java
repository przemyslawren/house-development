package pl.edu.pja.s22687.apartment;

import java.util.HashMap;
import java.util.Map;

public class Property {
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

    public String toString() {
        return "Property{" + "id=" + id + ", area=" + area + '}';
    }
}
