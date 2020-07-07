package com.traders.traders.dto;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity

@Table(name = "products")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "product_name", columnDefinition = "VARCHAR(50)")
	private String productName;

	@Column(name = "product_price", columnDefinition = "INT(11) UNSIGNED")
	private Integer productPrice;

	@Column(name = "product_mrp", columnDefinition = "INT(11) UNSIGNED")
	private Integer mrp;

	@Column(name = "product_selling_price", columnDefinition = "INT(11) UNSIGNED")
	private Integer sellingPrice;

	@Column(name = "product_quantity", columnDefinition = "INT(11) UNSIGNED")
	private Integer quantity;

	@CreationTimestamp
	@Column(name = "created_at", updatable = false)
	private Date createdAt;

	@UpdateTimestamp
	@Column(name = "updated_at", updatable = false)
	private Date updatedAt;
}
