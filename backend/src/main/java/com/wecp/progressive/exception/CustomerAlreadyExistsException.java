package com.wecp.progressive.exception;

public class CustomerAlreadyExistsException extends Exception {
    public CustomerAlreadyExistsException(String emsg){
        super(emsg);
    }
}