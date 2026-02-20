package com.gibara.courseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gibara.courseJava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
