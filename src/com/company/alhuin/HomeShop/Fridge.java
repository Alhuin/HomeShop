package com.company.alhuin.HomeShop;

public class Fridge extends Product {
    int litter;
    boolean freezer;

    public Fridge(String name, String description, double price, int litter, boolean freezer) {
        super(name, description, price);
        this.litter = litter;
        this.freezer = freezer;
    }

    public int getLitter() {
        return litter;
    }

    public boolean isFreezer() {
        return freezer;
    }

}
