package com.example.service;

import com.example.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void adduser(User user);
}
