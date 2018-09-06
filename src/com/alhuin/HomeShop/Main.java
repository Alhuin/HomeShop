package com.alhuin.HomeShop;

import com.alhuin.HomeShop.bill.Bill;
import com.alhuin.HomeShop.bill.Client;
import com.alhuin.HomeShop.bill.FileWriter;
import com.alhuin.HomeShop.bill.NoProductInBillException;
import com.alhuin.HomeShop.delivery.Delivery;
import com.alhuin.HomeShop.delivery.ExpressDelivery;
import com.alhuin.HomeShop.product.Fridge;
import com.alhuin.HomeShop.product.Product;
import com.alhuin.HomeShop.product.Television;

public class Main {

    public static void main(String[] args) {

        FileWriter fileWriter = new FileWriter("facture");
        Product cafe = new Product("café", "un café bien fort", 1.30);
        Television tv = new Television("Hitachi", "Hitachi TV", 399.99, 120, "LED");
        Fridge fridge = new Fridge("Gorenge", "Gorenge fridge", 499.99, 50, true);
        Client customer = new Client("Alex Dupont", "1 rue de l'épée");
        Delivery delivery = new ExpressDelivery("Paris");
        Bill bill = new Bill(customer, delivery);

        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);
        try {
            bill.generate(fileWriter);
        } catch (NoProductInBillException e) {
            System.out.println("Pas de produits dans la facture");
        }
    }
}