package com.wecp.progressive.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Loan {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Long id;
    // private String loanType;
    // private Double amount;

    private long id;
    private String loanType;
    private double amount;

    public Loan(){}

    public Loan(long id, String loanType, double amount) {
        this.id = id;
        this.loanType = loanType;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // public Loan(Long id, String loanType, Double amount) {
    //     this.id = id;
    //     this.loanType = loanType;
    //     this.amount = amount;
    // }

    // public Long getId() {
    //     return id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    // public String getLoanType() {
    //     return loanType;
    // }

    // public void setLoanType(String loanType) {
    //     this.loanType = loanType;
    // }

    // public Double getAmount() {
    //     return amount;
    // }

    // public void setAmount(Double amount) {
    //     this.amount = amount;
    // }
}