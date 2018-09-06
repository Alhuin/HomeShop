package com.alhuin.HomeShop.bill;

public class Client {
    private String fullName;
    private String address;

    public static void main(String[] args) {

    }

    public Client(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }
}
