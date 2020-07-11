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

	@GetMapping("/getallproductsbyName")
	public List<Products> getAllProductsbyName(@RequestParam(value = "term",required = false) String query) {
		System.out.println("getAllProductsbyName");
		return productService.getAllProducts(query);
	}
	
	@GetMapping("/getallproducts")
	public List<Products> getAllProducts() {
		System.out.println("getAllProducts");
		return productService.getAllProducts(null);
	}

	@GetMapping("/getproductbyid/{id}")
	public Products getProductById(@PathVariable(value = "id") Long productId) {
		return productService.getProductById(productId);
	}

	@PutMapping("/updateproductbyid/{id}")
	public Products updateProductById(@PathVariable(value = "id") Long productId, @RequestBody Products products) {
		return productService.updateProductById(productId, products);
	}

	@GetMapping("/deleteproductbyid/{id}")
	public void deleteProductById(@PathVariable(value = "id") Long productId) {
		productService.deleteProductById(productId);
	}

	@PostMapping("/addproduct")
	public void saveProduct( @RequestBody Products products) {
		productService.addProduct(products);
	}
}
