package com.jeeva.demoPayTestApp.controller;


import com.jeeva.demoPayTestApp.model.User;
import com.jeeva.demoPayTestApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user/")
    public User createUser(@RequestBody User userInfo)
    {
        userService.createOrEditUser(userInfo);
        return userService.getUser(userInfo.getId());
    }

    @PutMapping("/user/{userId}")
    public User updateUser(@RequestBody User userInfo)
    {
        userService.createOrEditUser(userInfo);
        return userService.getUser(userInfo.getId());
    }

    @GetMapping("/user/{userId}")
    public User getUser(Integer userId)
    {
        return userService.getUser(userId);
    }

    @GetMapping("/user/")
    public List<User> getAllUser()
    {
        return userService.getAllUser();
    }

    @DeleteMapping("/user/{userId}")
    public void deleteUser(Integer userId)
    {
        userService.deleteUser(userId);
    }



}
