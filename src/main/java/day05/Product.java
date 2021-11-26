package day05;

public class Product {
    private String name;
    private Types type;
    private double price;

    public Product(String name, Types type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Types getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}