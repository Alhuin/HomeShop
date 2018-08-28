package com.company.alhuin;

import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products;


    public static void main(String[] args) {

    }

    public Bill(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    /**
     * Add a quantity of product to the bill
     *
     * @param product  the product to add
     * @param quantity the quantity to add
     */
    public void addProduct(Product product, Integer quantity) {
        this.products.put(product, quantity);
    }
}

