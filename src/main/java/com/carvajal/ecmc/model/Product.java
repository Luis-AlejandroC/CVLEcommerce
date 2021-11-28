package com.carvajal.ecmc.model;

public class Product {
	private Integer productId;
	private String productName;
	private String productImage;
	private double productPrice;
	private int productQuantity;//Stock

	public Product() {
		
	}
	
	// Product Constructor
	public Product(Integer productId, String productName, String productImage, double productPrice,
			int productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productImage = productImage;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
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

	public int getproductQuantity() {
		return productQuantity;
	}

	public void setproductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	//print values
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productImage=" + productImage
				+ ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + "]";
	}
		
	
}
