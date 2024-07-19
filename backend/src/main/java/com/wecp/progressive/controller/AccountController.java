package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.exception.AccountNotFoundException;
import com.wecp.progressive.service.AccountServiceImplJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountServiceImplJpa accountServiceImplJpa;

    @GetMapping
    public ResponseEntity<List<Accounts>> getAllAccounts() throws SQLException {
        return new ResponseEntity<List<Accounts>>(accountServiceImplJpa.getAllAccounts(), HttpStatus.OK) ;
    }

    @GetMapping("/{accountId}")
    public ResponseEntity<Accounts> getAccountById(@PathVariable int accountId) throws SQLException {
        return new ResponseEntity<Accounts>(accountServiceImplJpa.getAccountById(accountId), HttpStatus.OK) ;
    }

    @GetMapping("/user/{customerId}")
    public ResponseEntity<List<Accounts>> getAccountsByUser(String param) throws SQLException {
        //return new ResponseEntity<List<Accounts>>(accountServiceImplJpa.getAccountsByUser), HttpStatus.OK) ;
        return null;
    }

    @PostMapping
    public ResponseEntity<Integer> addAccount(@RequestBody Accounts accounts) throws SQLException {
        return new ResponseEntity<Integer>(accountServiceImplJpa.addAccount(accounts), HttpStatus.OK) ;
    }

    @PutMapping("/{accountId}")
    public ResponseEntity<Void> updateAccount(@PathVariable int accountId,@RequestBody Accounts accounts) throws SQLException {
        accountServiceImplJpa.updateAccount(accounts);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/{accountId}")
    public ResponseEntity<Void> deleteAccount(@PathVariable int accountId) throws SQLException {
        accountServiceImplJpa.deleteAccount(accountId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ExceptionHandler(AccountNotFoundException.class)
    public ResponseEntity<String> handlecustomerexception(AccountNotFoundException cae){
        return new ResponseEntity<String>(cae.getMessage(), HttpStatus.OK);
    }
}