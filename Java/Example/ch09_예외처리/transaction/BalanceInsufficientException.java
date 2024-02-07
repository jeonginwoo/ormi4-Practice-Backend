package ch09_예외처리.transaction;

public class BalanceInsufficientException extends Exception {

    public BalanceInsufficientException() {
    }

    public BalanceInsufficientException(String message) {
        super(message);
    }
}
