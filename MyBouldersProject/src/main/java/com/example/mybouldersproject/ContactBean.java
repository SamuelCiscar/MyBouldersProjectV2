package com.example.mybouldersproject;


import jakarta.persistence.*;

@Entity
@Table(name = "contacts")
public class ContactBean {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //c'est l'id est il est auto incrément
    private String name;
    private String email;

    private String message;

    //Constructeur vide obligatoire //Constructeur vide obligatoire
    public ContactBean(){}

    public ContactBean(String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }

    //Getter et Setter


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
