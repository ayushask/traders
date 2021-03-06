package com.traders.traders.service;

import com.traders.traders.dto.Products;
import com.traders.traders.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductsServiceImpl implements ProductsService {
    private ProductsRepository productsRepository;

    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public List<Products> getAllProducts(String query) {
    	System.out.println("getAllProducts "+ query);
    	List<Products>  product = null;
    	if(query == null){
    		System.out.println(query);
        	product = productsRepository.findAll();
        	System.out.println(product);
        	return product;
    	}else {
    		query = query + '%';
    		product =  productsRepository.findByProductName(query);
    		 System.out.println(product);
         	return product;
    	}
    }

    @Override
    public Products getProductById(Long productId) {
        Optional<Products> product = productsRepository.findById(productId);
        if(Objects.isNull(product) || !product.isPresent()){
            return null;
        }
        return product.get();
    }

    @Override
    public Products updateProductById(Long productId,Products products){
        Optional<Products> product = productsRepository.findById(productId);
        if(Objects.isNull(product) || !product.isPresent()){
            return null;
        }
        Products pNew  = product.get();
        pNew.setProductName(products.getProductName());
        pNew.setProductPrice(products.getProductPrice());
        pNew.setMrp(products.getMrp());
        pNew.setSellingPrice(products.getSellingPrice());
        pNew.setQuantity(products.getQuantity());

        Products updateproduct = productsRepository.save(pNew);
        return  updateproduct;
    }

	@Override
	public void deleteProductById(Long productId) {
		 Optional<Products> product = productsRepository.findById(productId);
	       
	         productsRepository.delete(product.get());
	     
	}

	@Override
	public Products addProduct(Products products) {
		 return productsRepository.save(products);
	}
}
