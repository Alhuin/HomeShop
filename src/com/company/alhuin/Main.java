package com.company.alhuin;

public class Main {

    public static void main(String[] args) {
        Product cafe = new Product("café", "un café bien fort", 1.30);
        Television tv = new Television("Hitachi", "Hitachi TV", 399.99, 120, "LED");
        Fridge fridge = new Fridge("Gorenge", "Gorenge fridge", 499.99, 50, true);
        Customer customer = new Customer("Alex Dupont", "1 rue de l'épée");
        Bill bill = new Bill(customer);

        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);
        bill.displayBill();
    }
}
