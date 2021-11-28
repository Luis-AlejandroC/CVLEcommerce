package com.carvajal.ecmc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Productos")
public class Product {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer productId;
	private String productName;
	private String productImage;
	private double productPrice;
	private int productQuantity;//Stock

	//JPA attribute
	@ManyToOne
	private User user;
	
	public Product() {
		
	}
	
	// Product Constructor
	public Product(Integer productId, String productName, String productImage, double productPrice, int productQuantity,
			User user) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productImage = productImage;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.user = user;
	}
	
	// Product getter and setter 
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	//print product values
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productImage=" + productImage
				+ ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + "]";
	}
		
	
}
