package com.springboot.dao;

import com.springboot.model.Customer;
import com.springboot.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDaoImpl {

    @Autowired
    CustomerRepo customerRepoImpl;

    public Customer saveData(Customer customer){
        return customerRepoImpl.save(customer);
    }

    public List<Customer> getAllData(){
        return customerRepoImpl.findAll();
    }

    public Customer updateData(Customer customer){
        return customerRepoImpl.save(customer);
    }

    public void deleteData(int custId){
        customerRepoImpl.deleteById(custId);
    }


}
