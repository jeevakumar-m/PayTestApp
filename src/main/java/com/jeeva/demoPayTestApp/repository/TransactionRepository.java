package com.jeeva.demoPayTestApp.repository;

import com.jeeva.demoPayTestApp.model.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction,Integer> {
}
