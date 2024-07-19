package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.repository.CustomerRepository;

@Service
public class CustomerServiceImplJpa implements CustomerService{
    @Autowired
    public CustomerRepository customerRepository;

    // @Override
    // public List<Customers> getAllCustomers() throws SQLException {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
    // }

    // @Override
    // public Customers getCustomerById(int customerId) throws SQLException {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
    // }

    // @Override
    // public int addCustomer(Customers customers) throws SQLException {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'addCustomer'");
    // }

    // @Override
    // public void updateCustomer(Customers customers) throws SQLException {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    // }

    // @Override
    // public void deleteCustomer(int customerId) throws SQLException {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
    // }

    // @Override
    // public List<Customers> getAllCustomersSortedByName() throws SQLException {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByName'");
    // }

    // @Override
    // public List<Customers> getAllCustomersFromArrayList() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersFromArrayList'");
    // }

    // @Override
    // public List<Customers> addCustomersToArrayList(Customers customers) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'addCustomersToArrayList'");
    // }

    // @Override
    // public List<Customers> getAllCustomersSortedByNameFromArrayList() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByNameFromArrayList'");
    // }

    // @Override
    // public void emptyArrayList() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
    // }

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        customerRepository.findAll();
        throw new SQLException("okay");
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException{
         customerRepository.findById(customerId).get();
         throw new SQLException("okay");
    }

    @Override
    public int addCustomer(Customers customers)throws SQLException{
        customerRepository.save(customers);
        throw new SQLException("okay");
    }

    @Override
    public void updateCustomer(Customers customers)throws SQLException{
        customerRepository.save(customers);
        throw new SQLException("okay");
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException{
        customerRepository.deleteById(customerId);
        throw new SQLException("okay");
    }

    @Override
    public List<Customers> getAllCustomersSortedByName()throws SQLException{
        //customerRepository.getCustomerNameSorted();
        throw new SQLException("okay");
    }

    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        return null;
    }

    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        return null;
    }

    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList() {
        return null;
    }

    @Override
    public void emptyArrayList() {
    }
}