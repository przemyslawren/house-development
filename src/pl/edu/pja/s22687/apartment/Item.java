package pl.edu.pja.s22687.apartment;

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

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

}