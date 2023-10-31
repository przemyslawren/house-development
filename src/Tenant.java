import java.util.ArrayList;
import java.util.List;

public class Tenant extends Person {

    List<TenantLetter> tenantLetters;
    public Tenant(String name, String surname, int personalIDNumber, String address, String dateOfBirth) {
        super(name, surname, personalIDNumber, address, dateOfBirth);
        this.tenantLetters = new ArrayList<>();
    }

    public String toString() {
        return "Tenant: " + super.toString();
    }

    public void addTenantLetter(TenantLetter tenantLetter) {
        this.tenantLetters.add(tenantLetter);
    }

    public void removeTenantLetter(TenantLetter tenantLetter) {
        this.tenantLetters.remove(tenantLetter);
    }

    public List<TenantLetter> getTenantLetters() {
        return this.tenantLetters;
    }

}
