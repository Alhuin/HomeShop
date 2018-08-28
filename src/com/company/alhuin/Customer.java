package com.company.alhuin;

public class Customer {
    private String fullname;
    private String address;

    public static void main(String[] args) {

    }

    public void Customer(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    public String getFullName() {
        return fullname;
    }

    public String getAddress() {
        return address;
    }
}
