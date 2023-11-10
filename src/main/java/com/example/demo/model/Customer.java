package com.example.demo.model;

public class Customer {

    private Long customerId;
    private String name;

    // Default constructor
    public Customer() {
    }

    // Constructor with parameters
    public Customer(Long customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // Getters and Setters
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
