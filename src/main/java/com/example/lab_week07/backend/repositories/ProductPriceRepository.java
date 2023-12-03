package com.example.lab_week07.backend.repositories;

import com.example.lab_week07.backend.models.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, LocalDateTime> {
}