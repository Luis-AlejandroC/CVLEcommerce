package com.carvajal.ecmc.model;

public class OrderDetails {
	private Integer orderDetailId;
	private String orderDetailNumber;
	private double orderDetailQuantity;
	private double prderDetailPrice;
	private double orderDetailTotal;
	
	public OrderDetails() {
		
	}
	//OrderDetail constructor
	public OrderDetails(Integer orderDetailId, String orderDetailNumber, double orderDetailQuantity,
			double prderDetailPrice, double orderDetailTotal) {
		super();
		this.orderDetailId = orderDetailId;
		this.orderDetailNumber = orderDetailNumber;
		this.orderDetailQuantity = orderDetailQuantity;
		this.prderDetailPrice = prderDetailPrice;
		this.orderDetailTotal = orderDetailTotal;
	}
	
	//OrderDetail getters and setter
	public Integer getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(Integer orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
	public String getOrderDetailNumber() {
		return orderDetailNumber;
	}
	public void setOrderDetailNumber(String orderDetailNumber) {
		this.orderDetailNumber = orderDetailNumber;
	}
	public double getOrderDetailQuantity() {
		return orderDetailQuantity;
	}
	public void setOrderDetailQuantity(double orderDetailQuantity) {
		this.orderDetailQuantity = orderDetailQuantity;
	}
	public double getPrderDetailPrice() {
		return prderDetailPrice;
	}
	public void setPrderDetailPrice(double prderDetailPrice) {
		this.prderDetailPrice = prderDetailPrice;
	}
	public double getOrderDetailTotal() {
		return orderDetailTotal;
	}
	public void setOrderDetailTotal(double orderDetailTotal) {
		this.orderDetailTotal = orderDetailTotal;
	}
	
	//print Orderdetail values
	@Override
	public String toString() {
		return "OrderDetails [orderDetailId=" + orderDetailId + ", orderDetailNumber=" + orderDetailNumber
				+ ", orderDetailQuantity=" + orderDetailQuantity + ", prderDetailPrice=" + prderDetailPrice
				+ ", orderDetailTotal=" + orderDetailTotal + "]";
	}
	
	
}
