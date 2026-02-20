package com.gibara.courseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gibara.courseJava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
