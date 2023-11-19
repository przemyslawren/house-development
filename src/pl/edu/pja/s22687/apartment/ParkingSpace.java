package pl.edu.pja.s22687.apartment;

import pl.edu.pja.s22687.exceptions.TooManyThingsException;
import pl.edu.pja.s22687.interfaces.ITenant;
import pl.edu.pja.s22687.person.Tenant;
import pl.edu.pja.s22687.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpace extends Property implements ITenant {
    private Tenant mainTenant;
    private List<Item> items;

    public ParkingSpace(double area) {
        super(area);
        items = new ArrayList<>();
    }

    public ParkingSpace(double length, double width, double height) {
        super(length * width * height);
        items = new ArrayList<>();
    }


    public void addTenant(Tenant tenant) {
        if (this.mainTenant == null) {
            tenant.setMainTenant(true);
            this.mainTenant = tenant;
        } else {
            System.out.println("Parking space is already taken");
        }
    }

    public void addItem(Item item) throws TooManyThingsException {
        double newArea = area - item.getArea();
        if (newArea < 0) {
            throw new TooManyThingsException("Not enough space for " + item.getName() + " in parking space " + this);
        }
        items.add(item);
        area = newArea;
    }

    public ParkingSpace findParkingSpaceById(int id) {
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parking Space ID: ").append(id).append("\n");
        sb.append("Area left: ").append(String.format("%.2f", area)).append(" sqm\n");
        if (mainTenant == null) {
            sb.append(" - No tenants\n");
        } else {
            sb.append(" - Main Tenant").append("\n");
            sb.append("   Full Name: ").append(mainTenant.getName()).append(" ").append(mainTenant.getSurname()).append("\n");
        }
        return sb.toString();
    }
}
