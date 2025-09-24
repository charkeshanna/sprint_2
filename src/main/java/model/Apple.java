package model;

public class Apple extends Food implements Discountable{
    String colour;


   public Apple (int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }

    @Override
    public double getDiscount() {
        if (colour.equalsIgnoreCase("red")) {
            return 0.6;
        }
        return super.getDiscount();
    }
}
