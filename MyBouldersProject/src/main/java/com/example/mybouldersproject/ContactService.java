package com.example.mybouldersproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRep;

    public ContactBean createContact(String name, String email, String message) throws Exception {
        if(name == null || name.isEmpty()){
            throw new Exception("Name missing");
        }
        else if(email == null || email.isEmpty()){
            throw new Exception("Email missing");
        }

        else if (message == null || message.isEmpty()){
            throw new Exception("Message missing");
        }
        ContactBean contact = new ContactBean( name, email, message);
        contactRep.save(contact);
        return contact;
    }

    public List<ContactBean> getAll() {
        return contactRep.findAll();
    }
}