package com.wby.user.controller;

import com.wby.user.dao.UserDao;
import com.wby.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    public void InsertUser(@RequestBody UserDao userRequest) {
        userService.insert(userRequest);
    }

    @RequestMapping("/list")
    public List<UserDao> findUserList() {
        return userService.findList();
    }

    @RequestMapping(value = "/{id}")
    public UserDao findById(@PathVariable int id) {
        return userService.findById(id);
    }
}
