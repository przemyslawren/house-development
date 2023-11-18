package pl.edu.pja.s22687.person;

import pl.edu.pja.s22687.Rent;
import pl.edu.pja.s22687.TenantLetter;
import pl.edu.pja.s22687.apartment.Apartment;
import pl.edu.pja.s22687.apartment.ParkingSpace;
import pl.edu.pja.s22687.apartment.Property;
import pl.edu.pja.s22687.exceptions.ProblematicTenantException;
import pl.edu.pja.s22687.interfaces.IRent;
import pl.edu.pja.s22687.utilities.SharedDate;

import java.util.ArrayList;
import java.util.List;

public class Tenant extends Person implements IRent {
    private boolean isMainTenant;
    List<Property> properties;
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
        if (tenantLetters.size() <= 3  ) { //add for rents more than 5 per tenant
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
        } else throw new ProblematicTenantException("Tenant has not paid the rent");

    }

    public void rent(ParkingSpace parkingSpace, int days) throws ProblematicTenantException {
        if (tenantLetters.size() > 3  ) { //add for rents more than 5 per tenant
            if (this.isMainTenant) {
                parkingSpace.addTenant(this);
                parkingSpace.setStartRent(SharedDate.getInstance().getDate());
                parkingSpace.setEndRent(SharedDate.getInstance().getDate().plusDays(days));
                Rent.addToListOfRents(parkingSpace);
            } else {
                System.out.println("You are not main tenant");
            }
        } else throw new ProblematicTenantException("Tenant has not paid the rent");

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
        sb.append("   Date of Birth: ").append(getDateOfBirth()).append("\n\n");
        return sb.toString();
    }
}
