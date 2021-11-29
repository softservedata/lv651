package homework.hw04.practicaltasks;

public class Task3 {
    public static void main(String[] args) {
        Product pr1 = new Product("Milk", 20, 1200);
        Product pr2 = new Product("Water", 5, 1750);
        Product pr3 = new Product("Chocolate", 50, 190);
        Product pr4 = new Product("Snacks", 45, 1000);
        Product prTemp = new Product();

        //Display the name and quantity of the most expensive item.

        if (pr1.getPrice() > pr2.getPrice()) {
            prTemp = pr1;
        } else {
            prTemp = pr2;
        }
        if (pr3.getPrice() > pr4.getPrice()) {
            if (pr3.getPrice() > prTemp.getPrice()) {
                System.out.println("The most expensive product: " + pr3.toString());
            } else {
                System.out.println("The most expensive product: " + prTemp.toString());
            }
        } else {
            if (pr4.getPrice() > prTemp.getPrice()) {
                System.out.println("The most expensive product: " + pr4.toString());
            } else {
                System.out.println("The most expensive product: " + prTemp.toString());
            }
        }

        //Display the name of the items, which has the biggest quantity.

        if (pr1.getQuantity() > pr2.getQuantity()) {
            prTemp = pr1;
        } else {
            prTemp = pr2;
        }
        if (pr3.getQuantity() > pr4.getQuantity()) {
            if (pr3.getQuantity() > prTemp.getQuantity()) {
                System.out.println("The biggest quantity: " + pr3.toString());
            } else {
                System.out.println("The biggest quantity: " + prTemp.toString());
            }
        } else {
            if (pr4.getQuantity() > prTemp.getQuantity()) {
                System.out.println("The biggest quantity: " + pr4.toString());
            } else {
                System.out.println("The biggest quantity: " + prTemp.toString());
            }
        }
    }
}
