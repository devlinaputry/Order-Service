package com.service.users.service;

import com.service.users.entity.Order;
import com.service.users.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class OrderService {
    @Autowired
    OrderRepository repository;

    public Order saveOrder(Order orders) {
        Order order = orders;
        if (orders.getOrderId() != null && orders.getProductId() != null) {
            order = repository.save(orders);
        }
        return order;
    }
}
