package com.prueba.tecnica.demo.controller;


import com.prueba.tecnica.demo.models.Event;
import com.prueba.tecnica.demo.models.User;
import com.prueba.tecnica.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/iasapi")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user/create")
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

}
