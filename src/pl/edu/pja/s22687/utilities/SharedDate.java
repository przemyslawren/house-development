package pl.edu.pja.s22687.utilities;

import java.time.LocalDate;

public class SharedDate {
    private LocalDate date;

    public SharedDate() {
        this.date = LocalDate.now();
    }

    public synchronized void advanceDay() {
        this.date = this.date.plusDays(1);
        System.out.println("Date advanced to " + this.date);
    }

    public synchronized LocalDate getDate() {
        return this.date;
    }
}