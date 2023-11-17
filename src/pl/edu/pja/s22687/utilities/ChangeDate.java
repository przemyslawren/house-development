package pl.edu.pja.s22687.utilities;

public class ChangeDate implements Runnable {
    private final SharedDate sharedDate;

    public ChangeDate(SharedDate sharedDate) {
        this.sharedDate = sharedDate;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(5000);
                this.sharedDate.advanceDay();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
