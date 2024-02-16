package pro.sky.SpringHwProject.model;

public class ShoppingBasket {
    private String product;
    private double price;
    private double weight;

    private final int id;

    public ShoppingBasket(String product, double price, double weight, int id) {
        this.product = product;
        this.price = price;
        this.weight = weight;
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ShoppingBasket{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", id=" + id +
                '}';
    }
}
