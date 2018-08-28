package com.company.alhuin;

public class Customer {
    private String fullName;
    private String address;

    public static void main(String[] args) {

    }

    public Customer(String fullName, String address) {
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
