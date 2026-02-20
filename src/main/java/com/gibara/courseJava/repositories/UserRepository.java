package com.gibara.courseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gibara.courseJava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    

}
