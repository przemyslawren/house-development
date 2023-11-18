package pl.edu.pja.s22687.interfaces;

import pl.edu.pja.s22687.apartment.Apartment;
import pl.edu.pja.s22687.apartment.ParkingSpace;
import pl.edu.pja.s22687.exceptions.ProblematicTenantException;

public interface RentAction {
    void rent(Apartment apartment, int days) throws ProblematicTenantException;

    void rent(ParkingSpace parkingSpace, int days) throws ProblematicTenantException;
}
