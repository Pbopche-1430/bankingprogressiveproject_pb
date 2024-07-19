package com.wecp.progressive.controller;

import com.wecp.progressive.dto.LoginRequest;
import com.wecp.progressive.entity.Customers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CustomerLoginController {

    public ResponseEntity<Customers> registerUser(@RequestBody Customers user) {
        return null;
    }

    public ResponseEntity<Customers> loginUser(@RequestBody LoginRequest loginRequest) {
        return null;
    }
}