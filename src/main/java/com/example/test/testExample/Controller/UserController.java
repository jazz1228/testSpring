package com.example.test.testExample.Controller;


import com.example.test.testExample.Model.User;
import com.example.test.testExample.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@RestController
@RequestMapping("/")
@EnableWebMvc
@CrossOrigin(origins = "*")
public class UserController {


    @Autowired
    UserRepository userRepository;



    @GetMapping("users")
    public List<User> getMessage(){
       return userRepository.findAll();
    }


}
