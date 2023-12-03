package com.example.lab_week07.backend.repositories;

import com.example.lab_week07.backend.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}