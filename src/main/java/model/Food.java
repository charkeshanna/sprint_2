package model;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;


    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
