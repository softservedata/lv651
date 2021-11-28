package HW05.PracticalTasks;

public class PracticalTask4 {
    public static void main(String[] args) {
        /*Create class Product with fields name,price and quantity.
           -Create four instances of type Product.
           -Display the name and quantity of the most expensive item.
           -Display the name of the items, which has the biggest quantity.
        */
        Product[] products = new Product[4];
        products[0] = new Product("Bread", 19.0, 10.0);
        products[1] = new Product("Milk", 24.0, 5.0);
        products[2] = new Product("Butter", 56.0, 15.0);
        products[3] = new Product("Cream", 13.0, 20.0);

        Product maxPriceProduct = products[0];
        for (Product pr : products) {
            if (pr.getPrice() > maxPriceProduct.getPrice()) {
                maxPriceProduct = pr;
            }
        }

        Product maxQuantityProduct = products[0];
        for (Product pr : products) {
            if (pr.getQuantity() > maxQuantityProduct.getQuantity()) {
                maxQuantityProduct = pr;
            }
        }

        System.out.println("The most expensive product is:" + maxPriceProduct);
        System.out.println("The most quantity product is:" + maxQuantityProduct);

    }
}
