package com.jeeva.demoPayTestApp.service;

import com.jeeva.demoPayTestApp.model.Transaction;
import com.jeeva.demoPayTestApp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    public List<Transaction> getAllTransaction()
    {
        List<Transaction> txnList = new ArrayList<>();
        transactionRepository.findAll().forEach(x->txnList.add(x));
        return txnList;
    }

    public Transaction getTransaction(Integer id)
    {
        return transactionRepository.findById(id).get();
    }

    public List<Transaction> getTransactionByUserId(Integer userId)
    {
        List<Transaction> txnList = new ArrayList<>();
        transactionRepository.findAll().forEach(x->{
            if(x.getUserId().equals(userId))
            {
                txnList.add(x);
            }

        });
        return txnList;
    }


    public void addOrEditTransaction(Transaction txn)
    {
        transactionRepository.save(txn);
    }

    public void softDeleteTransaction(Integer id)
    {
        Transaction txn = getTransaction(id);
        txn.setTransactionStatus(false);
        transactionRepository.save(txn);
    }

}
