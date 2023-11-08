package pl.housedevelopment;

import pl.housedevelopment.person.Tenant;

public class TenantLetter {

    private Tenant tenant;
    private String date;
    private String content;
    private double debt;

    public TenantLetter(Tenant tenant, String date, String content, double debt) {
        this.tenant = tenant;
        this.date = date;
        this.content = content;
        this.debt = debt;
    }

    public String toString() {
        return "TenantLetter: " + tenant + ", " + date + ", " + content + ", " + debt;
    }

}
