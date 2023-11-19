package pl.edu.pja.s22687.utilities;

import pl.edu.pja.s22687.Rent;
import pl.edu.pja.s22687.apartment.Property;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Properties;

public class SharedDate {
    private static SharedDate INSTANCE = null;
    private LocalDate date;

    private SharedDate() {
        this.date = LocalDate.now();
    }
    public static SharedDate getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SharedDate();
        }
        return INSTANCE;
    }

    public synchronized void advanceDay() {
        this.date = this.date.plusDays(1);
        System.out.println("Date advanced to " + this.date + "\n");
    }

    public synchronized LocalDate getDate() {
        return this.date;
    }

}