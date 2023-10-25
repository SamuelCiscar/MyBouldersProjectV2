package com.example.mybouldersproject;

public class ContactData {

    public String getMessage;
    private String name;
    private String email;
    private String message;

    // Constructeur par défaut
    public ContactData() {
    }

    // Getters et Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}