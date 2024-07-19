package com.wecp.progressive.exception;

public class OutOfBalanceException extends Exception{
    public OutOfBalanceException(String emessage){
        super(emessage);
    }
}