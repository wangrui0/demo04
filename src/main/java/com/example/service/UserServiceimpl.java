package com.example.service;

import com.example.entity.User;
import com.example.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserServiceimpl implements UserService {
    //交给spring去管理然后拿出来这个对象
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void adduser(User user) {
        this.usersMapper.insertUser(user);

    }
}
