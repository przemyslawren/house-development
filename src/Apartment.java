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
}
