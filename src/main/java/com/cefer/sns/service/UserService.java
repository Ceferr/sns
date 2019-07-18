package com.cefer.sns.service;

import com.cefer.sns.entity.User;
import com.cefer.sns.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User listUser(int id){
        return userMapper.listUser(id);
    }

    public void insertUser(User user){
        userMapper.insertUser(user);
    }
}
