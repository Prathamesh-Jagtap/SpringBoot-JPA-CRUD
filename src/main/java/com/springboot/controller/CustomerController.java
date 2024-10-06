package com.springboot.controller;

import com.springboot.model.Customer;
import com.springboot.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @PostMapping("/save")
    public ResponseEntity<Customer> saveData(@RequestBody Customer customer){
        return  ResponseEntity.ok(customerServiceImpl.saveData(customer));
    }


    @GetMapping("/get")
    public ResponseEntity<List<Customer>> getAllData(){
        return ResponseEntity.ok(customerServiceImpl.getAllData());
    }

    @PutMapping("/update/{custId}")
    public ResponseEntity<Customer> updateData(@PathVariable int custId,@RequestBody Customer customer){
        return ResponseEntity.ok(customerServiceImpl.updateData(customer));
    }

    @DeleteMapping("/delete/{custId}")
    public  ResponseEntity<String> deleteData(@PathVariable int custId){
        customerServiceImpl.deleteData(custId);
        return ResponseEntity.ok("Data Deleted Successfully !");
    }



}
