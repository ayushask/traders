package com.traders.traders.service;


import com.traders.traders.dto.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);
    
    void deleteProdutById(Integer product);
}
