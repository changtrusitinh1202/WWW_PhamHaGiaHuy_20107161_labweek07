package com.example.lab_week07.backend.repositories;

import com.example.lab_week07.backend.models.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {
}