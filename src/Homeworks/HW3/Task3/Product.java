package Homeworks.HW3.Task3;

import java.util.Set;

enum SetPrice {Increase, Decrease}

public class Product extends Money{

    private String name;
    public Product(int fiat, int pennies, String currency) {
        super(fiat, pennies, currency);
    }

    public void decreasePrice(int fiat, int pennies) {
        while (pennies > 100) {
            this.fiat--;
            pennies -= 100;
        }
        this.pennies -= pennies;
    }


}
