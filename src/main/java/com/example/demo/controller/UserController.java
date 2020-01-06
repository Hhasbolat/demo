package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.model.User;
import com.example.demo.model.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
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
    public UserDto addUser(@RequestBody UserDto user){
        return  userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<UserDto> getUser(){
        return userService.getUser();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    //@PathVariable("id") == @PathVariable olabilir aynı şey path ismi id olduğu için :D
    public ResponseEntity<User> findById(@PathVariable("id") Integer id){
        return ResponseEntity.of(userService.findById(id));
    }
}
