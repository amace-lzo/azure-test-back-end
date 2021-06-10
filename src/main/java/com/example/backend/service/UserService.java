package com.example.backend.service;

import com.example.backend.dao.UserMapper;
import com.example.backend.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<UserInfo> getAllUser() {
        return userMapper.getAllUser();
    }
}
