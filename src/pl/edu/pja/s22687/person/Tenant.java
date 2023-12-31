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
        if (tenantLetters.size() > 3) {
            throw new ProblematicTenantException("Tenant " + this + " has too many unresolved issues: " + tenantLetters);
        }
        if (properties.size() >= 5) {
            throw new ProblematicTenantException("Tenant " + this + " has already rented 5 properties " + this.getListOfProperties());
        }
        if (this.isMainTenant) {
            apartment.addTenant(this);
            apartment.setStartRent(SharedDate.getInstance().getDate());
            apartment.setEndRent(SharedDate.getInstance().getDate().plusDays(days));
            Rent.addToListOfRents(apartment);
            properties.add(apartment);
        } else {
            System.out.println("You are not main tenant");
        }
    }

    public void rent(ParkingSpace parkingSpace, int days) throws ProblematicTenantException {
        if (tenantLetters.size() > 3) {
            throw new ProblematicTenantException("Tenant " + this + " has too many unresolved issues: " + tenantLetters);
        }
        if (properties.size() >= 5) {
            throw new ProblematicTenantException("Tenant " + this + " has already rented 5 properties " + this.getListOfProperties());
        }
        if (this.isMainTenant) {
                parkingSpace.addTenant(this);
                parkingSpace.setStartRent(SharedDate.getInstance().getDate());
                parkingSpace.setEndRent(SharedDate.getInstance().getDate().plusDays(days));
                Rent.addToListOfRents(parkingSpace);
                properties.add(parkingSpace);
            } else {
                System.out.println("You are not main tenant");
        }
    }

    public void renewRent(Property property, int additionalDays) throws ProblematicTenantException {
        if (!properties.contains(property)) {
            throw new ProblematicTenantException("This property is not rented by the tenant.");
        }

        LocalDate newEndRentDate = property.getEndRent().plusDays(additionalDays);
        property.setEndRent(newEndRentDate);
        property.setRentStatus(Rent.RentStatus.RENEWED);
        System.out.println("Rent for " + property + " has been renewed until " + newEndRentDate);

        removeTenantLetterForProperty(property);
    }

    private void removeTenantLetterForProperty(Property property) {
        tenantLetters.removeIf(letter -> letter.getProperty().equals(property));
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
