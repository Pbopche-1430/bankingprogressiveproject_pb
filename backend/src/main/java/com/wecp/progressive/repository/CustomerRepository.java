package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.wecp.progressive.entity.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers,Integer>{
    // @Query("select c from Customers c where c.name=:name sort by name")
    // public Customers getCustomerNameSorted();
}
