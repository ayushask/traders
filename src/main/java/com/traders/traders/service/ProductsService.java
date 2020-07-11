package com.traders.traders.service;


import com.traders.traders.dto.Products;

import java.util.List;

public interface ProductsService {

    List<Products> getAllProducts(String query);
    Products getProductById(Long productId);
    Products updateProductById(Long productId,Products products);
    void deleteProductById(Long productId);
    Products addProduct(Products products);
}
