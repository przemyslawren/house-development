package pl.edu.pja.s22687.utilities;
import pl.edu.pja.s22687.exceptions.ProblematicTenantException;
import pl.edu.pja.s22687.person.Tenant;

import java.util.List;

public class DateAndRentManager implements Runnable {
    private final SharedDate sharedDate;
    private int dateCounter = 0;
    private int rentCounter = 0;

    public DateAndRentManager(SharedDate sharedDate, List<Tenant> allTenants) {
        this.sharedDate = sharedDate;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(1000); // Sleep for 1 second
                dateCounter += 1000;
                rentCounter += 1000;

                if (dateCounter >= 5000) {
                    this.sharedDate.advanceDay();
                    dateCounter = 0; // Reset counter
                }

                if (rentCounter >= 10000) {
                        System.out.println("Checking rents for " + this.sharedDate.getDate() + "\n");
                        checkRent();

                    rentCounter = 0; // Reset counter
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
}
