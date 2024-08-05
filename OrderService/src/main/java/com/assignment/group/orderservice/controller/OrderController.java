package com.assignment.group.orderservice.controller;

import com.assignment.group.orderservice.entity.Order;
import com.assignment.group.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping
    public List<Order> getOrders() {
        return orderService.findAll();

    }
    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.save(order);
    }
}
