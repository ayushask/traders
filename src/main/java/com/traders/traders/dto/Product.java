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
//public class Product {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer id;
//
//	private Integer version;
//
//	private Date date;
//	private String bill;
//	private String party;
//	private String gstNo;
//	private BigDecimal qnty;
//	private BigDecimal rate;
//	private BigDecimal amount;
//	private BigDecimal received;
//	private BigDecimal difference;
//	private String bag;
//	private BigDecimal broker;
//	private BigDecimal gst;
//	private BigDecimal billamt;
//	private BigDecimal claim;
//	private BigDecimal debitNote;
//	private BigDecimal cgst;
//	private BigDecimal sgst;
//	private BigDecimal fgst;
//
//    @ManyToOne
//    private Genes gene;
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
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}
//	public String getBill() {
//		return bill;
//	}
//	public void setBill(String bill) {
//		this.bill = bill;
//	}
//	public String getParty() {
//		return party;
//	}
//	public void setParty(String party) {
//		this.party = party;
//	}
//	public String getGstNo() {
//		return gstNo;
//	}
//	public void setGstNo(String gstNo) {
//		this.gstNo = gstNo;
//	}
//	public BigDecimal getQnty() {
//		return qnty;
//	}
//	public void setQnty(BigDecimal qnty) {
//		this.qnty = qnty;
//	}
//	public BigDecimal getRate() {
//		return rate;
//	}
//	public void setRate(BigDecimal rate) {
//		this.rate = rate;
//	}
//	public BigDecimal getAmount() {
//		return amount;
//	}
//	public void setAmount(BigDecimal amount) {
//		this.amount = amount;
//	}
//	public BigDecimal getReceived() {
//		return received;
//	}
//	public void setReceived(BigDecimal received) {
//		this.received = received;
//	}
//	public BigDecimal getDifference() {
//		return difference;
//	}
//	public void setDifference(BigDecimal difference) {
//		this.difference = difference;
//	}
//	public String getBag() {
//		return bag;
//	}
//	public void setBag(String bag) {
//		this.bag = bag;
//	}
//	public BigDecimal getBroker() {
//		return broker;
//	}
//	public void setBroker(BigDecimal broker) {
//		this.broker = broker;
//	}
//	public BigDecimal getGst() {
//		return gst;
//	}
//	public void setGst(BigDecimal gst) {
//		this.gst = gst;
//	}
//	public BigDecimal getBillamt() {
//		return billamt;
//	}
//	public void setBillamt(BigDecimal billamt) {
//		this.billamt = billamt;
//	}
//	public BigDecimal getClaim() {
//		return claim;
//	}
//	public void setClaim(BigDecimal claim) {
//		this.claim = claim;
//	}
//	public BigDecimal getDebitNote() {
//		return debitNote;
//	}
//	public void setDebitNote(BigDecimal debitNote) {
//		this.debitNote = debitNote;
//	}
//	public BigDecimal getCgst() {
//		return cgst;
//	}
//	public void setCgst(BigDecimal cgst) {
//		this.cgst = cgst;
//	}
//	public BigDecimal getSgst() {
//		return sgst;
//	}
//	public void setSgst(BigDecimal sgst) {
//		this.sgst = sgst;
//	}
//	public BigDecimal getFgst() {
//		return fgst;
//	}
//	public void setFgst(BigDecimal fgst) {
//		this.fgst = fgst;
//	}
//	public Genes getGene() {
//		return gene;
//	}
//	public void setGene(Genes gene) {
//		this.gene = gene;
//	}
//
//
//}
