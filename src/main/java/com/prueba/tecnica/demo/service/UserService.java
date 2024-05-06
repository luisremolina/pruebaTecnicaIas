package com.prueba.tecnica.demo.service;

import com.prueba.tecnica.demo.models.User;
import com.prueba.tecnica.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public User saveUser(User user) {
        return userRepository.save(user);
    }


}
