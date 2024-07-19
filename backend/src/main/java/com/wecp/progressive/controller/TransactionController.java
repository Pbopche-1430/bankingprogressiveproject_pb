package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.service.TransactionServiceImplJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionServiceImplJpa transactionServiceImplJpa;

    @GetMapping
    public ResponseEntity<List<Transactions>> getAllTransactions() throws SQLException {
        return new ResponseEntity<List<Transactions>>(transactionServiceImplJpa.getAllTransactions(),HttpStatus.OK) ;
    }

    @GetMapping("/{transactionId}")
    public ResponseEntity<Transactions> getTransactionById(@PathVariable int transactionId) throws SQLException {
        return new ResponseEntity<Transactions>(transactionServiceImplJpa.getTransactionById(transactionId),HttpStatus.OK) ;
    }

    @PostMapping
    public ResponseEntity<Integer> addTransaction(@RequestBody Transactions transaction) throws SQLException {
        return new ResponseEntity<Integer>(transactionServiceImplJpa.addTransaction(transaction), HttpStatus.OK) ;
    }

    @PutMapping("/{transactionId}")
    public ResponseEntity<Void> updateTransaction(@PathVariable int transactionId,@RequestBody Transactions transaction) throws SQLException {
        transactionServiceImplJpa.updateTransaction(transaction);
        return new ResponseEntity<Void>(HttpStatus.OK) ;
    }

    @DeleteMapping("/{transactionId}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable int transactionId) throws SQLException {
        transactionServiceImplJpa.deleteTransaction(transactionId);
        return new ResponseEntity<>(HttpStatus.OK) ;
    }

    @GetMapping("/customer{customerId}")
    public ResponseEntity<List<Transactions>> getTransactionsByCustomerId(@PathVariable int customerId) throws SQLException{
        return null;
        //return new ResponseEntity<List<Transactions>>(TransactionServiceImplJpa.getTransactionsByCustomerId(customerId), HttpStatus.OK);
    }

}
