package com.example.lab_week07.backend.repositories;

import com.example.lab_week07.backend.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}