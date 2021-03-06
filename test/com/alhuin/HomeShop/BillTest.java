package com.alhuin.HomeShop;

import com.alhuin.HomeShop.bill.Bill;
import com.alhuin.HomeShop.bill.Client;
import com.alhuin.HomeShop.bill.FileWriter;
import com.alhuin.HomeShop.bill.NoProductInBillException;
import com.alhuin.HomeShop.delivery.Delivery;
import com.alhuin.HomeShop.delivery.RelayDelivery;
import com.alhuin.HomeShop.product.Fridge;
import com.alhuin.HomeShop.product.Product;
import com.alhuin.HomeShop.product.Television;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BillTest {
    private String output = "facture";
    private FileWriter fileWriter = new FileWriter(output);
    private Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
    private Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
    private Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
    private Client customer = new Client("Juste Leblanc", "19 rue Germain Pilon, Paris");
    private Delivery lowCostRelayDelivery = new RelayDelivery(27);

    @Test
    public void Given_emptyProductList_generatingBill_Then_throwsException() {
        Bill bill = new Bill(customer, lowCostRelayDelivery);
        assertThrows(NoProductInBillException.class, () -> bill.generate(fileWriter));
    }

    @Test
    public void Given_3productsAndDelivery_When_generatingBill_Then_getGoodTotal() {
        Bill bill = new Bill(customer, lowCostRelayDelivery);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);
        assertEquals(870.98, bill.getTotal(), 0.01);
    }
}