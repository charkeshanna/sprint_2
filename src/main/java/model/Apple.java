package model;

import model.constants.Discount;
import model.constants.Colour;

public class Apple extends Food {
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
        if (colour.equalsIgnoreCase(Colour.COLOUR_RED)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        return Discount.DEFAULT_DISCOUNT;
    }
}
