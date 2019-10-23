package com.example.service;

import com.example.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void adduser(User user);
}
