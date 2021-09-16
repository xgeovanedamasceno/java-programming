package xd.geo.aelum.oop;

public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(String message, double value) {
        super(message + " " + value);
    }
}
