package com.jeeva.demoPayTestApp.repository;

import com.jeeva.demoPayTestApp.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Integer> {
}
