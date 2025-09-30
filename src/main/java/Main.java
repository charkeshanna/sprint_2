
import model.constants.Colour;
import service.ShoppingCart;
import model.Food;
import model.Apple;
import model.Meat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Food meat = new Meat (5, 100);
        Food redApple = new Apple (10, 50, Colour.COLOUR_RED);
        Food greenApple = new Apple (8, 60, Colour.COLOUR_GREEN);
        Food [] arrayOfFood = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(arrayOfFood);
        //System.out.println("Общая сумма товаров без скидки " + cart.getTotalPrice());
        System.out.printf("Общая сумма товаров без скидки %.2f%n", cart.getTotalPrice());
        System.out.printf("Общая сумма товаров со скидкой %.2f%n", cart.getTotalPriceWithDiscount());
        System.out.printf("Общая сумма вегетарианских товаров без скидки %.2f%n", cart.getVeggiePrice());

    }
}