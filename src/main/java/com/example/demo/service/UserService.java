package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

        UserDto addUser(UserDto user);

        List<UserDto> getUser();

        Optional<User> findById(Integer id);
}
