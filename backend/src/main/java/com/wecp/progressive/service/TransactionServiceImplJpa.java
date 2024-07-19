package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.repository.TransactionRepository;

@Service
public class TransactionServiceImplJpa implements TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<Transactions> getAllTransactions() throws SQLException {
        transactionRepository.findAll();
        throw new UnsupportedOperationException("Unimplemented method 'getAllTransactions'");
    }

    @Override
    public Transactions getTransactionById(int transactionId) throws SQLException {
        transactionRepository.findById(transactionId);
        throw new UnsupportedOperationException("Unimplemented method 'getTransactionById'");
    }

    @Override
    public int addTransaction(Transactions transaction) throws SQLException {
        transactionRepository.save(transaction);
        throw new UnsupportedOperationException("Unimplemented method 'addTransaction'");
    }

    @Override
    public void updateTransaction(Transactions transaction) throws SQLException {
        transactionRepository.save(transaction);
        throw new UnsupportedOperationException("Unimplemented method 'updateTransaction'");
    }

    @Override
    public void deleteTransaction(int transactionId) throws SQLException {
        transactionRepository.deleteById(transactionId);
        throw new UnsupportedOperationException("Unimplemented method 'deleteTransaction'");
    }

    @Override
    public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException{
        //transactionRepository.getTransactionbyaccountbycustomer(customerId);
        throw new UnsupportedOperationException("Unimplemented method 'getTransactionsByCustomerId'");
    }

}
