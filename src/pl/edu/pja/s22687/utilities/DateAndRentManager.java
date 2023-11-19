package pl.edu.pja.s22687.utilities;
import pl.edu.pja.s22687.exceptions.ProblematicTenantException;
import pl.edu.pja.s22687.person.Tenant;

import java.util.List;

public class DateAndRentManager implements Runnable {
    private final SharedDate sharedDate;
    private int dateCounter = 0;
    private int rentCounter = 0;
    private boolean checkRents = true;

    public DateAndRentManager(SharedDate sharedDate, List<Tenant> allTenants) {
        this.sharedDate = sharedDate;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(1000);
                dateCounter += 1000;
                rentCounter += 1000;

                if (dateCounter >= 5000) {
                    this.sharedDate.advanceDay();
                    dateCounter = 0;
                }

                if (rentCounter >= 10000 && checkRents) {
                        System.out.println("Checking rents for " + this.sharedDate.getDate() + "\n");
                        checkRent();

                    rentCounter = 0;
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    private void checkRent() {
        for (Tenant tenant : TenantManager.getAllTenants()) {
           tenant.checkRentStatus();
        }
    }

    public void toggleRentChecking() {
        this.checkRents = !this.checkRents;
        System.out.println("Rent checking is now " + (this.checkRents ? "enabled" : "disabled"));
    }
}
