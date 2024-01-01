package com.jeeva.demoPayTestApp.service;

import com.jeeva.demoPayTestApp.model.User;
import com.jeeva.demoPayTestApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUser()
    {
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(user->userList.add(user));
        return userList;
    }

    public User getUser(Integer userId)
    {
        return userRepository.findById(userId).get();
    }

    public void createOrEditUser(User userInfo)
    {
        userRepository.save(userInfo);
    }

    public void deleteUser(int userId)
    {
        userRepository.deleteById(userId);
    }

}
