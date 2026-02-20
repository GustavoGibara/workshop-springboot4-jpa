package com.gibara.courseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gibara.courseJava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
