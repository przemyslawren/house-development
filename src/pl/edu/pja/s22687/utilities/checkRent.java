package pl.edu.pja.s22687.utilities;

import pl.edu.pja.s22687.Rent;
import pl.edu.pja.s22687.apartment.Property;

import static pl.edu.pja.s22687.Rent.getListOfRents;

public class CheckRent implements Runnable {
    private final SharedDate sharedDate;

    public CheckRent(SharedDate sharedDate) {
        this.sharedDate = sharedDate;
    }
    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(10000);
                System.out.println("Checking rent for " + this.sharedDate.getDate());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
