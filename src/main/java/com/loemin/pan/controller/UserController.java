package com.loemin.pan.controller;

import com.loemin.pan.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/signUp")
    public void signUp(User user) {

    }

    @PostMapping("/signIn")
    public void signIn(User user) {

    }
}
