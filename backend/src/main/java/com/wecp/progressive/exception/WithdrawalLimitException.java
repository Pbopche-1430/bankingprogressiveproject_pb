package com.wecp.progressive.exception;

public class WithdrawalLimitException extends Exception{
    public WithdrawalLimitException(String exceptionmsg){
        super(exceptionmsg);
    }
}