package com.alhuin.HomeShop.bill;

import com.alhuin.HomeShop.product.Product;
import com.alhuin.HomeShop.delivery.Delivery;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Client client;
    private Map<Product, Integer> products = new HashMap<Product, Integer>();
    private Delivery delivery;

    public Bill(Client client, Delivery delivery) {
        this.client = client;
        this.delivery = delivery;
    }

    public Client getclient() {
        return client;
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

    /**
     * Generate the bill with a given Writer(interface)
     *
     * @param writer the given Writer
     */
    public void generate(Writer writer) {
        if (products.isEmpty())
            throw new NoProductInBillException();
        writer.start();
        writer.writeLine("HomeShop compagnie");
        writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
        writer.writeLine("");
        writer.writeLine("Facture à l'attention de : ");
        writer.writeLine(client.getFullName());
        writer.writeLine(client.getAddress());
        writer.writeLine("");
        writer.writeLine("Mode de livraison : " + delivery.getInfo() + " " + delivery.getPrice());
        writer.writeLine("");
        writer.writeLine("Produits :");
        writer.writeLine("-------------------------------------------");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            writer.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s)");
            writer.writeLine("");
        }
        writer.writeLine("Livraison : " + delivery.getPrice());
        writer.writeLine("-------------------------------------------");
        writer.writeLine("Total : " + getTotal());
        writer.stop();
    }

    public double getTotal() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total + delivery.getPrice();
    }
}