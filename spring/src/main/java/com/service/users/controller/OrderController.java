package com.service.users.controller;

import com.service.users.entity.Order;
import com.service.users.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService service;

    @PostMapping
    public ResponseEntity<Order> saveOrder(@RequestBody Order request){
        Order orders = service.saveOrder(request);
        return new ResponseEntity<Order>(orders, HttpStatus.CREATED);
    }

    @GetMapping
    public String getAll(){
        return "Hello";
    }
}
