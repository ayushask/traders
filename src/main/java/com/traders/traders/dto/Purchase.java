//package com.traders.traders.dto;
//
//import java.math.BigDecimal;
//import java.sql.Date;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class Purchase {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer id;
//
//	private Integer version;
//
//	private Date date;
////	private String bill;
////	private String party;
////	private String gstNo;
//	private int qnty;
//	private BigDecimal rate;
//	private BigDecimal amount;
//	private BigDecimal lastStock;
////	private BigDecimal difference;
////	private String bag;
////	private BigDecimal broker;
////	private BigDecimal gst;
////	private BigDecimal billamt;
////	private BigDecimal claim;
////	private BigDecimal debitNote;
////	private BigDecimal cgst;
////	private BigDecimal sgst;
////	private BigDecimal fgst;
//
//    @ManyToOne
//    private Genes gene;
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public Integer getVersion() {
//		return version;
//	}
//
//	public void setVersion(Integer version) {
//		this.version = version;
//	}
//
//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//
//	public int getQnty() {
//		return qnty;
//	}
//
//	public void setQnty(int qnty) {
//		this.qnty = qnty;
//	}
//
//	public BigDecimal getRate() {
//		return rate;
//	}
//
//	public void setRate(BigDecimal rate) {
//		this.rate = rate;
//	}
//
//	public BigDecimal getAmount() {
//		return amount;
//	}
//
//	public void setAmount(BigDecimal amount) {
//		this.amount = amount;
//	}
//
//	public BigDecimal getLastStock() {
//		return lastStock;
//	}
//
//	public void setLastStock(BigDecimal lastStock) {
//		this.lastStock = lastStock;
//	}
//
//	public Genes getGene() {
//		return gene;
//	}
//
//	public void setGene(Genes gene) {
//		this.gene = gene;
//	}
//
//}
