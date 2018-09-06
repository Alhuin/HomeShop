package com.alhuin.HomeShop.delivery;

public class RelayDelivery implements Delivery {
    int nbRelay;

    public RelayDelivery(int nbRelay) {
        this.nbRelay = nbRelay;
    }

    @Override
    public double getPrice() {
        if (nbRelay > 0 && nbRelay < 23)
            return 0;
        else if (nbRelay > 22 && nbRelay < 48)
            return 2.99;
        else
            return 4.99;
    }

    @Override
    public String getInfo() {
        return "Livraison en point relai";
    }
}
