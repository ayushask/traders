package com.traders.traders.controllers;

import com.traders.traders.dto.Products;
import com.traders.traders.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductsController {
    @Autowired
    ProductsService productService;

    @GetMapping("/getallproducts")
    public List<Products> getAllProducts() {
       return  productService.getAllProducts();
    }

    @GetMapping("/getproductbyid/{id}")
    public Products getProductById(@PathVariable(value = "id") Long productId) {
        return  productService.getProductById(productId);
    }

    @PutMapping("/updateproductbyid/{id}")
    public Products updateProductById(@PathVariable(value = "id") Long productId,
                                      @RequestBody Products products) {
        return  productService.updateProductById(productId,products);
    }
}
