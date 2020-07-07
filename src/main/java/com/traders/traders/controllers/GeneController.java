package com.traders.traders.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.traders.traders.dto.Genes;
import com.traders.traders.dto.Product;
import com.traders.traders.service.GeneService;
import com.traders.traders.service.ProductService;

@Controller
public class GeneController {

	@Autowired
	GeneService geneService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("genes", geneService.listAllGeness());
		System.out.println("Index called ");
		return "index";
	}

	@RequestMapping(value = "/genes", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("genes", geneService.listAllGeness());
		System.out.println("Returning GENES:");
		return "index";
	}
	

	@RequestMapping("gene/{id}")
	public String showProduct(@PathVariable Integer id, Model model) {
		model.addAttribute("gene", geneService.getGenesById(id));
		return "showgene";
	}
	
	@RequestMapping("gene/delete/{id}")
	public String deleteById(@PathVariable Integer id, Model model) {
		geneService.deleteProdutById(id);
		 return "redirect:/products/";
	}

	@RequestMapping("gene/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		model.addAttribute("gene", geneService.getGenesById(id));
		return "addnewgene";
	}

	@RequestMapping("gene/new")
	public String newProduct(Model model) {
		model.addAttribute("gene", new Genes	());
		return "addnewgene";
	}

	@RequestMapping(value = "gene", method = RequestMethod.POST)
	public String saveGene(Genes gene) {
		System.out.println(gene);
		geneService.saveGenes(gene);

		return "redirect:/gene/" + gene.getId();
	}
	
}
