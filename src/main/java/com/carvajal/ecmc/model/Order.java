package com.carvajal.ecmc.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Pedidos")
public class Order {
	
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private Integer orderId;
	private String orderNumber;
	private Date dateCreated;
	private Date dateReceived;
	
	private double orderTotal;
	
	@ManyToOne
	private User user;
	
	@OneToOne(mappedBy = "order")
	private OrderDetails detail;
	
	public Order() {
		
	}
	
	//Order constructor
	public Order(Integer orderId, String orderNumber, Date dateCreated, Date dateReceived, double orderTotal) {
		super();
		this.orderId = orderId;
		this.orderNumber = orderNumber;
		this.dateCreated = dateCreated;
		this.dateReceived = dateReceived;
		this.orderTotal = orderTotal;
	}
	
	//Order getters and setter
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}		
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public OrderDetails getDetail() {
		return detail;
	}

	public void setDetail(OrderDetails detail) {
		this.detail = detail;
	}

	//print Order values
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderNumber=" + orderNumber + ", dateCreated=" + dateCreated
				+ ", dateReceived=" + dateReceived + ", orderTotal=" + orderTotal + "]";
	}
			
}
