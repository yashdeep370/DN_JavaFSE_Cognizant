class main {
    public static void main(String[] args) {

        InventoryManager manager =
                new InventoryManager();

        manager.addProduct(
                new Product(1,
                        "Laptop",
                        10,
                        55000));

        manager.addProduct(
                new Product(2,
                        "Mouse",
                        50,
                        500));

        manager.displayProducts();

        manager.updateProduct(1,
                20,
                53000);

        manager.deleteProduct(2);

        System.out.println("After Changes:");

        manager.displayProducts();
    }
}