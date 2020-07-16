package com.example.springbootsecuritytestapp;

import org.springframework.data.jpa.repository.JpaRepository;

//@Service
public interface UserRepository extends JpaRepository<DatabaseConfig, Long> {
    DatabaseConfig findByUserName(String username);
}
