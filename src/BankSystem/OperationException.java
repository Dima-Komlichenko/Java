package BankSystem;

public class OperationException extends Exception {

    String error = "";

    public OperationException (String error) {
        this.error = error;
    }

    @Override
    public String toString () {
        return error;
    }
}
