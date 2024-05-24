package com.yusufakbas.customquery.service;

import com.yusufakbas.customquery.converter.UserConverter;
import com.yusufakbas.customquery.dto.UserDto;
import com.yusufakbas.customquery.model.User;
import com.yusufakbas.customquery.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserDto> getActiveUsersJPA() {
        List<User> activeUsers = userRepository.findByActiveTrue();
        return UserConverter.toDtoList(activeUsers);
    }

    public List<UserDto> getActiveUsersJPQL() {
        List<User> activeUsers = userRepository.findByActiveTrueJPQL();
        return UserConverter.toDtoList(activeUsers);
    }

    public List<UserDto> getActiveUsersNative() {
        List<User> activeUsers = userRepository.findByActiveTrueNative();
        return UserConverter.toDtoList(activeUsers);
    }

    public List<UserDto> getUsernameAndActiveTrueJPA(String username) {
        List<User> users = userRepository.findByUsernameAndActiveTrue(username);
        return UserConverter.toDtoList(users);
    }

    public List<UserDto> getUsernameAndActiveTrueJPQL(String username) {
        List<User> users = userRepository.findByUsernameAndActiveTrueJPQL(username);
        return UserConverter.toDtoList(users);
    }

    public List<UserDto> getUsernameAndActiveTrueNative(String username) {
        List<User> users = userRepository.findByUsernameAndActiveTrueNative(username);
        return UserConverter.toDtoList(users);
    }

    public long getCountActiveUsers() {
        return userRepository.countByActiveTrue();
    }

    public long getCountActiveUsersJPQL() {
        return userRepository.countByActiveTrueJPQL();
    }

    public long getCountActiveUsersNative() {
        return userRepository.countByActiveTrueNative();
    }
}
