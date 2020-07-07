package com.traders.traders.repository;

import org.springframework.data.repository.CrudRepository;

import com.traders.traders.dto.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
