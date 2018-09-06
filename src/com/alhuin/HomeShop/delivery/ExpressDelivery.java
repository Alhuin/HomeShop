package com.alhuin.HomeShop.delivery;

public class ExpressDelivery implements Delivery {
    String city;

    public ExpressDelivery(String city) {
        this.city = city;
    }

    @Override
    public double getPrice() {
        if (city.equals("Paris"))
            return 6.99;
        else
            return 9.99;
    }

    @Override
    public String getInfo() {
        return "Livraison express";
    }
}
