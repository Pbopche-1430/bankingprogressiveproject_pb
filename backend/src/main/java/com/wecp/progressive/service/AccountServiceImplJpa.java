package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.repository.AccountRepository;

@Service
public class AccountServiceImplJpa implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        accountRepository.findAll();
        throw new SQLException("Thankyou"); //UnsupportedOperationException("Unimplemented method 'getAllAccounts'");
    }

    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        //accountRepository.findById(userId);
        throw new SQLException("Thankyou"); //UnsupportedOperationException("Unimplemented method 'getAccountsByUser'");
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        accountRepository.findById(accountId);
        throw new SQLException("Thankyou"); //UnsupportedOperationException("Unimplemented method 'getAccountById'");
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        accountRepository.save(accounts);
        throw new SQLException("Thankyou"); //UnsupportedOperationException("Unimplemented method 'addAccount'");
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {
        accountRepository.save(accounts);
        throw new SQLException("Thankyou");  //UnsupportedOperationException("Unimplemented method 'updateAccount'");
    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {
        accountRepository.deleteById(accountId);
        throw new SQLException("Thankyou");  //UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        //accountRepository.getAccountBalance();
        throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalance'");
    }

    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsFromArrayList'");
    }

    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        throw new UnsupportedOperationException("Unimplemented method 'addAccountToArrayList'");
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalanceFromArrayList'");
    }

    @Override
    public void emptyArrayList() {
        throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
    }
    
}