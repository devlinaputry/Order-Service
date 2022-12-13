package com.service.users.services;

import com.service.users.entity.Order;
import com.service.users.repository.OrderRepository;
import com.service.users.service.OrderService;
import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTests {

    @InjectMocks
    OrderService orderService;

    @Mock
    OrderRepository orderRepository;

    Order order = new Order("124231", "ut123", BigDecimal.valueOf(10), BigDecimal.valueOf(50000));

    @Test
    void testSaveOrderServiceTrue(){
        Order order1 = orderService.saveOrder(order);
        Mockito.when(orderRepository.save(order)).thenReturn(order);
//        Assertions.assertSame(orderService.saveOrder(order), order);
        Assertions.assertThat(order1).isNotNull();
    }
}
