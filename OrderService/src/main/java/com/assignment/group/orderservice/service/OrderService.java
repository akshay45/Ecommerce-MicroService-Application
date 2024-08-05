package com.assignment.group.orderservice.service;

import com.assignment.group.orderservice.entity.Order;
import com.assignment.group.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
private OrderRepository orderRepository;
public OrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
}
public Order save(Order order) {
    return orderRepository.save(order);
}
public List<Order> findAll() {
    return orderRepository.findAll();
}
}
