package cart;

import java.util.Map; // type général

public class Cart {
    // type générique on peut mettre plusieurs types de Map au cas où 
    Map<String, Double> storage; // clé valeur la clé un string et quantité integer

    Cart(Map<String, Double> storage) {
        this.storage = storage;
    }

    void buy(Product product, int quantity) {
        Double total = quantity * product.price; 

        // je peux ici ajouter le meme produit plusieurs fois
        // quand on commande des bananes, 5, la première fois storage.getOrDefault retourne 0.0 et ajoute 5*0.3
        // la deuxième fois on commande 1 banane, storage.getOrDefault retourne 1.5 + 0.3 
        storage.put(product.name, storage.getOrDefault(product.name, 0.0) + total);
    }

    Double total(){
        double total = 0 ;

        for( Double price : storage.values()){
            total += price;
        }

        return total;
    }

}
