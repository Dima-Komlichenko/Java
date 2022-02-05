package BankSystem;

public class Client {
    private String passport;
    private String name;
    private String account;

    public Client(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getPassport() {
        return passport;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.passport;
    }
}
