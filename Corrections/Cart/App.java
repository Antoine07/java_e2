package cart;

import java.util.HashMap;
import java.util.Map;

// point d'entrée de votre application 
public class App {
    public static void main(String[] args) {
        Map<String, Double> storage = new HashMap<>();

        Cart cart = new Cart(storage);

        Product apple = new Product("apple", 0.5);
        Product orange = new Product("orange", 0.7);
        Product banana = new Product("banana", 0.3);

        cart.buy(banana, 5);
        System.out.println("total " + cart.total() + "e");
        cart.buy(banana, 1);
        System.out.println("total " + cart.total() + "e");

    }
}
