package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.dto.UserDto;

import java.util.List;

public interface UserService {

        User addUser(User user);

        List<User> getUser();
}
