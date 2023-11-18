package pl.edu.pja.s22687.utilities;

import pl.edu.pja.s22687.person.Tenant;

import java.util.ArrayList;
import java.util.List;

public class TenantManager {
    private static List<Tenant> tenants;

    public TenantManager() {
        tenants = new ArrayList<>();
    }

    public void addTenant(Tenant tenant) {
        tenants.add(tenant);
    }

    public void removeTenant(Tenant tenant) {
        tenants.remove(tenant);
    }

    public static List<Tenant> getAllTenants() {
        return tenants;
    }
}
