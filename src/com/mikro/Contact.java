package com.mikro;

class Contact {
    String name;
    String email;
    String phoneNumber;
    String createdAt;

    public Contact(String name, String email, String phoneNumber, String createdAt) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.createdAt = createdAt;
    }
}