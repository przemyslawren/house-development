package pl.housedevelopment.apartment;

public class Item {
    String name;
    double area;

    public Item(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String toString() {
        return "Item{" + "name='" + name + '\'' + ", area=" + area + '}';
    }
}