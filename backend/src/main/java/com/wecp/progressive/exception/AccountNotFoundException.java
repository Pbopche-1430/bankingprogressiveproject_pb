package com.wecp.progressive.exception;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(String e){
        super(e);
    }
}