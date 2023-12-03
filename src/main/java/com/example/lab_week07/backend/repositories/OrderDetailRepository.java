package com.example.lab_week07.backend.repositories;

import com.example.lab_week07.backend.models.Order;
import com.example.lab_week07.backend.models.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Order> {
}