package model;

public class Meat extends Food {

    public Meat (int amount, double price) {
        super(amount, price);
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }
}
