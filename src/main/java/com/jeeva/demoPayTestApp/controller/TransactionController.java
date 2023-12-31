package com.jeeva.demoPayTestApp.controller;

import com.jeeva.demoPayTestApp.model.Transaction;
import com.jeeva.demoPayTestApp.repository.TransactionRepository;
import com.jeeva.demoPayTestApp.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @GetMapping("/txn/")
    public List<Transaction> getAllTxn()
    {
        return transactionService.getAllTransaction();
    }

    @GetMapping("/txn/{transactionId}")
    public Transaction getTxn(Integer transactionId)
    {
        return transactionService.getTransaction(transactionId);
    }

    @PostMapping("/txn/")
    public Transaction createTxn(@RequestBody Transaction txnBody)
    {
        transactionService.addOrEditTransaction(txnBody);
        return transactionService.getTransaction(txnBody.getTransactionId());
    }

}
