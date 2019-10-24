package com.example.controller;


import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Usercontrol {
    @Autowired
    private UserService userService;
    //页面跳转
    @RequestMapping("/{page}")
    public String showpage(@PathVariable String page){
        return page;
    }
    @RequestMapping("/adduser" )
    public String adduser(User user){
        this.userService.adduser(user);
        return "ok";

    }

}
