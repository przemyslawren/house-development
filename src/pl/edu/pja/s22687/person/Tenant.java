package pl.edu.pja.s22687.person;

import pl.edu.pja.s22687.Rent;
import pl.edu.pja.s22687.TenantLetter;
import pl.edu.pja.s22687.apartment.Apartment;
import pl.edu.pja.s22687.apartment.ParkingSpace;
import pl.edu.pja.s22687.apartment.Property;
import pl.edu.pja.s22687.exceptions.ProblematicTenantException;
import pl.edu.pja.s22687.interfaces.IRent;
import pl.edu.pja.s22687.utilities.SharedDate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tenant extends Person implements IRent {
    private boolean isMainTenant;
    ArrayList<Property> properties;
    List<TenantLetter> tenantLetters;
    boolean doRentParking = false;

    public Tenant(String name, String surname, String personalId, Address address, String dateOfBirth) {
        super(name, surname, personalId, address, dateOfBirth);
        this.isMainTenant = true;
        this.tenantLetters = new ArrayList<>();
        this.properties = new ArrayList<>();
    }

    public void setMainTenant(boolean isMainTenant) {
        this.isMainTenant = isMainTenant;
    }

    public boolean getMainTenant() {
        return isMainTenant;
    }

    public void rent(Apartment apartment, int days) throws ProblematicTenantException {
        if (tenantLetters.size() <= 3 || getListOfProperties().size() < 5) { //add for rents more than 5 per tenant
            if (this.isMainTenant) {
                apartment.addTenant(this);
                apartment.setStartRent(SharedDate.getInstance().getDate());
                apartment.setEndRent(SharedDate.getInstance().getDate().plusDays(days));
                apartment.setRentStatus(Rent.RentStatus.VALID);
                properties.add(apartment);
                if (doRentParking) {
                    rent(new ParkingSpace(30), 30);
                }
            } else {
                System.out.println("You are not main tenant");
            }
        } else throw new ProblematicTenantException("Tenant " + this + " has already rented 5 properties " + this.getListOfProperties());

    }

    public void rent(ParkingSpace parkingSpace, int days) throws ProblematicTenantException {
        if (getListOfProperties().size() < 5) {
            if (this.isMainTenant) {
                parkingSpace.addTenant(this);
                parkingSpace.setStartRent(SharedDate.getInstance().getDate());
                parkingSpace.setEndRent(SharedDate.getInstance().getDate().plusDays(days));
                Rent.addToListOfRents(parkingSpace);
                properties.add(parkingSpace);
            } else {
                System.out.println("You are not main tenant");
            }
        } else throw new ProblematicTenantException("Tenant " + this + " has already rented 5 properties " + this.getListOfProperties());

    }

    public ArrayList<Property> getListOfProperties() {
        return this.properties;
    }

    public boolean isWantToRentParking() {
        return doRentParking;
    }

    public void setWantToRentParking(boolean doRentParking) {
        this.doRentParking = doRentParking;
    }

    public void checkRentStatus() {
        LocalDate currentDate = SharedDate.getInstance().getDate();
        for (Property property : properties) {
            if (property.getEndRent().isBefore(currentDate)) {
                // Rent is expired
                property.setRentStatus(Rent.RentStatus.EXPIRED);
                this.tenantLetters.add(new TenantLetter(this));
                System.out.println("Rent expired for " + property);
            } else {
                // Rent is still valid
                property.setRentStatus(Rent.RentStatus.VALID);
                System.out.println("Rent is still valid for " + property);
            }
        }
    }

    public boolean areAllRentsExpired() {
        for (Property property : properties) {
            if (property.getRentStatus()) { // If rent is active for any property
                return false; // Not all rents are expired
            }
        }
        return true; // All rents are expired
    }

    public List<TenantLetter> getListOfTenantLetters() {
        return tenantLetters;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getMainTenant()) {
            sb.append(" - Main Tenant").append("\n");
            sb.append("   Full Name: ").append(getName()).append(" ").append(getSurname()).append("\n");
        } else {
            sb.append(" - Tenant").append("\n");
            sb.append("   Full Name: ").append(getName()).append(" ").append(getSurname()).append("\n");
        }
        sb.append("   PersonalID: ").append(getPersonalId()).append("\n");
        sb.append("   Address: ").append(getAddress()).append("\n");
        sb.append("   Date of Birth: ").append(getDateOfBirth()).append("\n");
        sb.append("   Properties: ").append(getListOfProperties().size()).append("\n");
        sb.append("   Tenant Letters: ").append(getListOfTenantLetters()).append("\n\n");
        return sb.toString();
    }
}
