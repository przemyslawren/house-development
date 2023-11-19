package pl.edu.pja.s22687;

import pl.edu.pja.s22687.apartment.Property;
import pl.edu.pja.s22687.person.Tenant;
import pl.edu.pja.s22687.utilities.SharedDate;

import java.time.LocalDate;

public class TenantLetter {

    private Tenant tenant;
    private LocalDate receivedDate;

    public TenantLetter(Tenant tenant) {
        this.tenant = tenant;
        this.receivedDate = SharedDate.getInstance().getDate();
    }

    @Override
    public String toString() {
        return "Dear " + tenant.getName() + " on day " + receivedDate + " we have received a letter about your late rent, please pay your debt or there will be consequences" + "\n" ;
    }
}
