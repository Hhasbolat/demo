package com.example.demo.service.converter;

import com.example.demo.model.User;
import com.example.demo.model.dto.UserDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserConverter {

    public static User convert(UserDto userDto1) {
        User user = new User();
        user.setName(userDto1.getName());
        user.setMail(userDto1.getMail());
        user.setSurname(userDto1.getSurname());
        user.setNickname(userDto1.getSurname());
        user.setPassword(userDto1.getPassword());

        return user;
    }
    public static UserDto convert(User save){
        UserDto userDto = new UserDto();

        userDto.setName(save.getName());
        userDto.setMail(save.getMail());
        userDto.setSurname(save.getSurname());
        userDto.setNickname(save.getNickname());
        userDto.setPassword(save.getPassword());

        return userDto;
    }

    public static List<UserDto> convert(List<User> userList){
        List<UserDto> userDtos = new ArrayList<>();

        for (User strings : userList){
            UserDto userDto = new UserDto();

            userDto.setName(strings.getName());
            userDto.setMail(strings.getMail());
            userDto.setSurname(strings.getSurname());
            userDto.setNickname(strings.getNickname());
            userDto.setPassword(strings.getPassword());

            userDtos.add(userDto);
        }
        return userDtos;
    }

    public static Optional<User> convertId(Optional<User> userList){



        return userList;

    }
}


