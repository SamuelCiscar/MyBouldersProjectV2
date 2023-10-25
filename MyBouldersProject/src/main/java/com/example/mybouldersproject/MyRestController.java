package com.example.mybouldersproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyRestController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/addContact")
    public List<ContactBean> addContact(@RequestBody ContactData data) throws Exception {
        System.out.println("/addContact name=" + data.getName() + " email=" + data.getEmail() + " message=" + data.getMessage);
        contactService.createContact(data.getName(), data.getEmail(), data.getMessage());
        return contactService.getAll();
    }
}
//@RestController
//public class MyRestController {
//
//    @Autowired
//    private ContactService contactService;
//
//
//    //http://localhost:8080/addContact?name=Bob&email=bob@gmail.com&message=bonjour
//
//    @GetMapping("/addContact")
//    public List<ContactBean> String(String name, String email, String message) throws Exception {
//        System.out.println("/addContact name=" + name + " email=" + email + "message=" + message);
//        contactService.createContact(name, email, message);
//        return contactService.getAll();
//    }
//}
