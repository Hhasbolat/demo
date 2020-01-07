package com.example.demo.service.impl;

import com.example.demo.model.Blog;
import com.example.demo.model.User;
import com.example.demo.model.dto.UserDto;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;
import com.example.demo.service.converter.UserConverter;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto addUser(UserDto userDto1) {
        User user = UserConverter.convert(userDto1);
        User save = userRepository.save(user);
        UserDto userDto = UserConverter.convert(save);

        return userDto;
    }

    @Override
    public List<UserDto> getUser() {
        List<User> all = userRepository.findAll();

        List<UserDto> dtoList = UserConverter.convert(all);

        return dtoList;
    }

    public Optional<User> findById(Integer id){
        Optional<User> all = userRepository.findById(id);

        return all;
    }

}
