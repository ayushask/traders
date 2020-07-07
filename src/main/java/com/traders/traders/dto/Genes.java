//package com.traders.traders.dto;
//
//import java.math.BigDecimal;
//import java.sql.Date;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//@Entity
//public class Genes {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "gene_id")
//	private Integer id;
//
//	private Integer version;
//
//	private String name;
//	private double tax = 0;
//
//	@OneToMany(cascade  = CascadeType.ALL)
//	Set<Genes> gene;
//
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public Integer getVersion() {
//		return version;
//	}
//	public void setVersion(Integer version) {
//		this.version = version;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getTax() {
//		return tax;
//	}
//	public void setTax(double tax) {
//		this.tax = tax;
//	}
//	public Set<Genes> getGene() {
//		return gene;
//	}
//	public void setGene(Set<Genes> gene) {
//		this.gene = gene;
//	}
//
//
//}
