//package com.traders.traders.controllers;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.traders.traders.dto.Genes;
//import com.traders.traders.dto.Product;
//import com.traders.traders.service.GeneService;
//import com.traders.traders.service.ProductService;
//
//@Controller
//public class ProductController {
//
//	@Autowired
//	ProductService productService;
//
//	@Autowired
//	GeneService geneService;
//
//	@RequestMapping(value = "/products", method = RequestMethod.GET)
//	public String list(Model model) {
//		model.addAttribute("products", productService.listAllProducts());
//		System.out.println("Returning rpoducts:");
//		return "showallproduct";
//	}
//
//
//	@RequestMapping("product/{id}")
//	public String showProduct(@PathVariable Integer id, Model model) {
//		model.addAttribute("product", productService.getProductById(id));
//		return "showproduct";
//	}
//
//	@RequestMapping("product/delete/{id}")
//	public String deleteById(@PathVariable Integer id, Model model) {
//		 productService.deleteProdutById(id);
//		 return "redirect:/products/";
//	}
//
//	/*@RequestMapping("product/edit/{id}")
//	public String edit(@PathVariable Integer id, Model model) {
//		model.addAttribute("product", productService.getProductById(id));
//		return "addnewform";
//	}*/
//
////	@RequestMapping("product/new")
////	public String newProduct(Model model) {
////		model.addAttribute("product", new Product());
////		return "addnewform";
////	}
//
//	@RequestMapping("product/new")
//	public String newProductBasedonGene(Model model,@RequestParam("geneid") Integer geneId) {
//		Product product = new Product();
//		Genes gene = geneService.getGenesById(geneId);
//		product.setGene(gene);
//		model.addAttribute("product", product);
//		return "addnewform";
//	}
//
//	@RequestMapping(value = "product", method = RequestMethod.POST)
//	public String saveProduct(Product product) {
//
//		productService.saveProduct(product);
//
//		return "redirect:/product/" + product.getId();
//	}
//
//	@RequestMapping("uploadpage")
//	public String upload(Model model) {
//		model.addAttribute("product", new Product());
//		return "productupload";
//	}
//
//}
