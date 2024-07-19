package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.wecp.progressive.entity.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts,Integer>{
    // @Query("select a from Accounts a where a.balance=:balance sort by balance")
    // public Accounts getAccountBalance();
}
