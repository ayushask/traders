package com.traders.traders.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.traders.traders.dto.Products;

@Controller
public class ProductController {

	@Autowired
	ProductsController controller;


	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("products", controller.getAllProducts());
		System.out.println("Returning rpoducts:");
		return "showallproduct";
	}


	@RequestMapping("product/{id}")
	public String showProduct(@PathVariable Long id, Model model) {
		model.addAttribute("product", controller.getProductById(id));
		return "showproduct";
	}

	@RequestMapping("product/delete/{id}")
	public String deleteById(@PathVariable Long id) {
		controller.deleteProductById(id);
		 return "redirect:/products/";
	}

	@RequestMapping("product/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("product", controller.getProductById(id));
		return "addnewform";
	}

//	@RequestMapping("product/new")
//	public String newProduct(Model model) {
//		model.addAttribute("product", new Product());
//		return "addnewform";
//	}

	@RequestMapping("product/new")
	public String newProductBasedonGene(Model model) {
		Products product = new Products();
		model.addAttribute("product", product);
		return "addnewform";
	}

	@RequestMapping(value = "product", method = RequestMethod.POST)
	public String saveProduct(Products product) {

		controller.saveProduct(product);

		return "redirect:/product/" + product.getId();
	}

	

}
