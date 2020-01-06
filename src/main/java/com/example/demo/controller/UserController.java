package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public User addUser(@RequestBody User user){
        return  userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUser(){
        return userService.getUser();
    }
}
