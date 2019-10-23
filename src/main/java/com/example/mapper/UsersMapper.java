package com.example.mapper;

import com.example.User;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface UsersMapper {
    void insertUser(User user);
}
