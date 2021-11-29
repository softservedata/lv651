package homework.hw04.practicaltasks;

public class Product {
    private String name;
    private float price;
    private float quantity;

    public Product() {
        this.name = "";
        this.price = 0;
        this.quantity = 0;
    }

    public Product(String name, float price, float quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name
                + ",[ price=" + price
                + ", quantity=" + quantity
                + "]";
    }
}
