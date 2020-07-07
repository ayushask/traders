package com.traders.traders.repository;

import com.traders.traders.dto.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
