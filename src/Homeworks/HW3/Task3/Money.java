package Homeworks.HW3.Task3;

public class Money {
    protected int fiat;
    protected int pennies;
    protected String currency;

    public Money(int fiat, int pennies, String currency) {
        this.fiat = fiat;
        this.pennies = pennies;
        this.currency = currency;
    }

    public String toString() {
        return fiat + "." + pennies + " " + currency;
    }

    public void setFiat(int fiat) {
        this.fiat = fiat;
    }

    public void setPennies(int pennies) {
        this.pennies = pennies;
    }
}
