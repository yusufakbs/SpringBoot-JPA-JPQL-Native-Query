package com.yusufakbas.customquery.converter;

import com.yusufakbas.customquery.dto.UserDto;
import com.yusufakbas.customquery.model.User;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class UserConverter {
    public User toEntity(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setActive(userDto.isActive());
        user.setSalary(userDto.getSalary());
        user.setBirthDate(userDto.getBirthDate());
        return user;
    }

    public UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setUsername(user.getUsername());
        userDto.setActive(user.isActive());
        userDto.setSalary(user.getSalary());
        userDto.setBirthDate(user.getBirthDate());
        return userDto;
    }

    public List<UserDto> toDtoList(List<User> users) {
        return users.stream().map(UserConverter::toDto).collect(Collectors.toList());
    }


}
