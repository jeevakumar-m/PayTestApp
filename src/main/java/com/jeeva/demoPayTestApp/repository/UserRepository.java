package com.jeeva.demopaytestapp.repository;

import com.jeeva.demopaytestapp.model.User;
import com.jeeva.demopaytestapp.service.UserService;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
