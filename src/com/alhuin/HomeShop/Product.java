package com.alhuin.HomeShop;

public class Product {
    private String name;
    private String description;
    double price;

    public static void main(String[] args) {

    }

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Display the full description of a product
     */
    public void look() {
        System.out.println(name);
        System.out.println(description);
    }

    /**
     * Add a quantity of a product to a specified bill
     *
     * @param bill     the specified bill
     * @param quantity the quantity
     */
    public void buy(Bill bill, Integer quantity) {

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Integer newPrice) {
        this.price = newPrice;
    }
}

