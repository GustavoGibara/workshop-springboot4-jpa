package com.gibara.courseJava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gibara.courseJava.entities.Order;
import com.gibara.courseJava.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        List<Order> list = repository.findAll();
        return list;
    }

    public Order findByID(Long id) {
        Optional<Order> order = repository.findById(id);
        return order.get();
    }
}
