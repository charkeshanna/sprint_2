package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food [] arrayOfFood;
    public ShoppingCart(Food [] arrayOfFood) {
        this.arrayOfFood = arrayOfFood;
    }
    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Food currentFood : arrayOfFood) {
            totalPrice += currentFood.getPrice() * currentFood.getAmount();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount () {
        double totalPriceWithDiscount = 0.0;
        for (Food currentFood : arrayOfFood) {
            totalPriceWithDiscount += (currentFood.getPrice()* currentFood.getAmount() * (1 - currentFood.getDiscount() ));
        }
        return totalPriceWithDiscount;
    }

    public double getVeggiePrice () {
        double totalVeggiePrice = 0.0;
        for (Food currentFood : arrayOfFood) {
            if (currentFood.isVegetarian()) {
                totalVeggiePrice += currentFood.getPrice()*currentFood.getAmount();
            }
        }
        return totalVeggiePrice;
        }

}

