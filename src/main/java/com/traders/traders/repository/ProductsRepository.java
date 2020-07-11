package com.traders.traders.repository;

import com.traders.traders.dto.Products;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductsRepository extends JpaRepository<Products, Long> {
	
	@Query("SELECT t FROM Products t where t.productName like :query") 
	List<Products> findByProductName( @Param("query") String query);
}
