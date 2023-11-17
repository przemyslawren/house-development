package pl.edu.pja.s22687.exceptions;

public class ProblematicTenantException extends Exception {

    public ProblematicTenantException() {
    }

    public ProblematicTenantException(String message) {
        super(message);
    }

    public ProblematicTenantException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProblematicTenantException(Throwable cause) {
        super(cause);
    }
}
