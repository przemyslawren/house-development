package pl.housedevelopment.apartment;

public class Property {
    protected static int nextId = 1; //static variable that holds next id to be assigned
    protected int id;
    protected double area;

    public Property(double area) {
        this.id = nextId++; //assign id and increment nextId
        this.area = area;
    }

    public String toString() {
        return "Property{" + "id=" + id + ", area=" + area + '}';
    }
}
