package service;

import model.Discountable;
import model.Food;

public class ShoppingCart implements Discountable {
    private Food [] arrayOfFood;
    public ShoppingCart(Food [] arrayOfFood) {
        this.arrayOfFood = arrayOfFood;
    }
    public double getTotalPrice() {
        double totalPrice = 0.0;
         for (int i =0; i < arrayOfFood.length; i++) {
             Food currentFood = arrayOfFood[i];
             totalPrice = totalPrice + currentFood.getPrice() * currentFood.getAmount();
         }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount () {
        double totalPriceWithDiscount = 0.0;
        for (int i = 0; i < arrayOfFood.length; i++) {
            Food currentFood = arrayOfFood[i];
            totalPriceWithDiscount = totalPriceWithDiscount + (currentFood.getPrice()* currentFood.getAmount() * (1 - currentFood.getDiscount() ));
        }
        return totalPriceWithDiscount;
    }

    public double getVeggiePrice () {
        double totalVeggiePrice = 0.0;
        for (int i = 0; i < arrayOfFood.length; i++) {
            Food currentFood = arrayOfFood[i];
            if (currentFood.isVegetarian()) {
                 totalVeggiePrice = totalVeggiePrice + currentFood.getPrice()*currentFood.getAmount();
            }
        }
        return totalVeggiePrice;
    }
}

