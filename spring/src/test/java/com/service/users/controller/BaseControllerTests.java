package com.service.users.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.users.service.OrderService;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class BaseControllerTests {

    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @InjectMocks
    protected OrderController orderController;

    @MockBean
    protected OrderService orderService;

}
