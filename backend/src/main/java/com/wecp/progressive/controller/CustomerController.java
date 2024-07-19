// package com.wecp.progressive.controller;

// import com.wecp.progressive.entity.Customers;
// import com.wecp.progressive.entity.Transactions;
// import com.wecp.progressive.exception.CustomerAlreadyExistsException;
// import com.wecp.progressive.service.CustomerServiceImplJpa;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import java.sql.SQLException;
// import java.util.List;

// @RestController
// @RequestMapping("/customers")
// public class CustomerController {

//     @Autowired
//     private CustomerServiceImplJpa customerServiceImplJpa;

//     @GetMapping
//     public ResponseEntity<List<Customers>> getAllCustomers() throws SQLException {
//         return new ResponseEntity<List<Customers>>(customerServiceImplJpa.getAllCustomers(), HttpStatus.OK);
//     }
    
//     @GetMapping("/{customerID}")
//     public ResponseEntity<Customers> getCustomerById(@PathVariable int customerId) throws SQLException {
//         return new ResponseEntity<Customers>(customerServiceImplJpa.getCustomerById(customerId),HttpStatus.OK) ;
//     }

//     @PostMapping
//     public ResponseEntity<Integer> addCustomer(@RequestBody Customers customers)throws SQLException  {
//         return new ResponseEntity<Integer>(customerServiceImplJpa.addCustomer(customers), HttpStatus.OK) ;
//     }

//     @PutMapping("/{customerID}")
//     public ResponseEntity<Void> updateCustomer(@PathVariable int customerId,@RequestBody Customers customers) throws SQLException {
//         customers.setcustomerId(customerId);
//         customerServiceImplJpa.updateCustomer(customers);
//         return new ResponseEntity<>(HttpStatus.OK);
//     }

//     @DeleteMapping("/{customerID}")
//     public ResponseEntity<Void> deleteCustomer(@PathVariable int customerId)throws SQLException  {
//         customerServiceImplJpa.deleteCustomer(customerId);
//         return new ResponseEntity<>(HttpStatus.OK);
//     }

//     @GetMapping
//     public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(@PathVariable int cutomerId) {
//         return new ResponseEntity<>(HttpStatus.OK);
//     }

//     @ExceptionHandler(CustomerAlreadyExistsException.class)
//     public ResponseEntity<String> handlecustomerexception(CustomerAlreadyExistsException cae){
//         return new ResponseEntity<String>(cae.getMessage(), HttpStatus.OK);
//     }
// }
