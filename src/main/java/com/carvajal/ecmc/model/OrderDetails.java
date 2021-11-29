package com.carvajal.ecmc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Detalle pedidos")
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderDetailId;
	private String orderDetailNumber;
	private double orderDetailQuantity;
	private double prderDetailPrice;
	private double orderDetailTotal;
	
	@OneToOne
	private Order order;
	
	@ManyToOne
	private Product product;
	
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
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	//print Orderdetail values
	@Override
	public String toString() {
		return "OrderDetails [orderDetailId=" + orderDetailId + ", orderDetailNumber=" + orderDetailNumber
				+ ", orderDetailQuantity=" + orderDetailQuantity + ", prderDetailPrice=" + prderDetailPrice
				+ ", orderDetailTotal=" + orderDetailTotal + "]";
	}
	
	
}
