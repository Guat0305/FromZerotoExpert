package com.Guat0305.boot.service;

import com.Guat0305.boot.mapper.Register;
import com.Guat0305.boot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    Register userMapper;

    public List<User> findAlluser() {
        return userMapper.findAlluser();
    }

    public User findUserbyName(String username) {
        return userMapper.findUserbyName(username);
    }

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
