package com.example.service;

import com.example.User;
import com.example.mapper.UsersMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceimpl implements UserService {
    @Resource
    private UsersMapper usersMapper;
    @Override
    public void adduser(User user) {
        this.usersMapper.insertUser(user);

    }
}
