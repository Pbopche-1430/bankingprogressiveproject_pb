package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.wecp.progressive.entity.Transactions;

@Repository
public interface TransactionRepository extends JpaRepository<Transactions,Integer> {
    // @Query("select t from Transactions t where t.accounts.customerId=:customerId")
    // public Transactions getTransactionbyaccountbycustomer(Integer customerId);
}
