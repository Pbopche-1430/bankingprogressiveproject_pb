package com.wecp.progressive.exception;

public class OutOfBalanceException extends RuntimeException{
    public OutOfBalanceException(String emessage){
        super(emessage);
    }
}