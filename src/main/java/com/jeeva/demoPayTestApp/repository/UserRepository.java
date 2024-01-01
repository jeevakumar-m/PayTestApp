package com.jeeva.demoPayTestApp.repository;

import com.jeeva.demoPayTestApp.model.User;
import com.jeeva.demoPayTestApp.service.UserService;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
