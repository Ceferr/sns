package com.cefer.sns.mapper;

import com.cefer.sns.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User listUser(int id);
    void insertUser(User user);
}
