package ru.skillbox;

public class Product {
    private final String name;
    private final String barCode;
    int price;

    public Product(String name, String barCode) {
        this.name = name;
        this.barCode = barCode;
    }

    public static void main(String[] args) {
        Product product = new Product("Apple", "8 999 333 555");
        product.setPrice(20);
        System.out.println(product.getPrice());
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
