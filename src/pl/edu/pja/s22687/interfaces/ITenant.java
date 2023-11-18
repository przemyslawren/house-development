package pl.edu.pja.s22687.interfaces;

import pl.edu.pja.s22687.apartment.Apartment;
import pl.edu.pja.s22687.apartment.ParkingSpace;
import pl.edu.pja.s22687.exceptions.ProblematicTenantException;
import pl.edu.pja.s22687.person.Tenant;

public interface ITenant {
    void addTenant(Tenant tenant);
}
