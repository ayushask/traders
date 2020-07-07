package com.traders.traders.repository;

import org.springframework.data.repository.CrudRepository;

import com.traders.traders.dto.Product;
import com.traders.traders.dto.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {
}
