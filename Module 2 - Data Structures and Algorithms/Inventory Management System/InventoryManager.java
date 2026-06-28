import java.util.*;

class InventoryManager {

    HashMap<Integer, Product> inventory =
            new HashMap<>();

    public void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    public void updateProduct(int id,
                              int quantity,
                              double price) {

        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.quantity = quantity;
            p.price = price;
        }
    }

    public void deleteProduct(int id) {
        inventory.remove(id);
    }

    public void displayProducts() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}