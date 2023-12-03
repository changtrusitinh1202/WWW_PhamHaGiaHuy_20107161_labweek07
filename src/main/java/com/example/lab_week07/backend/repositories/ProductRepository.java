package com.example.lab_week07.backend.repositories;

import com.example.lab_week07.backend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}