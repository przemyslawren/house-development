import java.util.List;

public class Apartment {

    private List<Tenant> tenants;
    private double area;
    private String startDate;
    private String endDate;

    public Apartment(List<Tenant> tenants, double area, String startDate, String endDate) {
        this.tenants = tenants;
        this.area = area;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public String toString() {
        return "Apartment: " + tenants + ", " + area + ", " + startDate + ", " + endDate;
    }

    public void addTenant(Tenant tenant) {
        this.tenants.add(tenant);
    }

    public void removeTenant(Tenant tenant) {
        this.tenants.remove(tenant);
    }

    public List<Tenant> getTenants() {
        return this.tenants;
    }
}
