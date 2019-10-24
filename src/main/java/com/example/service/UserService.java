package com.example.service;

import com.example.entity.User;
import org.springframework.stereotype.Service;
//把这个接口实现类的对象交给spring去管理
@Service
public interface UserService {
    public void adduser(User user);
}
