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
public class PurchaseController {


//
//	@RequestMapping(value = "/purchase", method = RequestMethod.GET)
//	public String list(Model model) {
//		model.addAttribute("purchase", purchaseService.listAllPurchase());
//		System.out.println("Returning purchase:");
//		return "showallpurchase";
//	}
//
//
//	@RequestMapping("purchase/{id}")
//	public String show(@PathVariable Integer id, Model model) {
//		model.addAttribute("purchase", purchaseService.getPurchaseBuId(id));
//		return "showproduct";
//	}
//
//	@RequestMapping("purchase/delete/{id}")
//	public String deleteById(@PathVariable Integer id, Model model) {
//		 purchaseService.deleteProdutById(id);
//		 return "redirect:/purchase/";
//	}
//
//	@RequestMapping("product/edit/{id}")
//	public String edit(@PathVariable Integer id, Model model) {
//		model.addAttribute("purchase", purchaseService.getPurchaseBuId(id));
//		return "addnewpurchase";
//	}

//	@RequestMapping("product/new")
//	public String newProduct(Model model) {
//		model.addAttribute("product", new Product());
//		return "addnewform";
//	}

	@RequestMapping("purchase/new")
	public String newEntry(Model model) {
		model.addAttribute("purchaseEntry", new ArrayList<Products>());
		return "order";
	}

//	@RequestMapping(value = "purchase", method = RequestMethod.POST)
//	public String save(Purchase purchase) {
//
//		purchaseService.savePurchase(purchase);
//
//		return "redirect:/purchase/" + purchase.getId();
//	}



}
