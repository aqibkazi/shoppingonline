package com.niit.backend.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Entity(name = "ORDERS")
@Component
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5680823247183420517L;

	/*
	 * Private Fields
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDER_ID")
	private int id;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "ORDER_ITEM_ID")
	private Set<OrderItem> orderItems;

	@Column(name = "GRAND_TOTAL")
	private int grandTotal;

	@Column(name = "NO_OF_ORDER_ITEMS")
	private int numberOfOrderItems;

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	
	@Column(name = "PAYMENT_MODE")
	private String paymentMode;
	
	@OneToOne(mappedBy = "order",fetch = FetchType.LAZY)
	private OrderAddress orderAddress;
	
	/*
	 * Getters and Setters
	 */
	
	public OrderAddress getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(OrderAddress orderAddress) {
		this.orderAddress = orderAddress;
	}
	
	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(int grandTotal) {
		this.grandTotal = grandTotal;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getNumberOfOrderItems() {
		return numberOfOrderItems;
	}

	public void setNumberOfOrderItems(int numberOfOrderItems) {
		this.numberOfOrderItems = numberOfOrderItems;
	}

	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	
	/*
	 * Method For Debugging
	 */

	@Override
	public String toString() {
		return "Order [id=" + id + ", grandTotal=" + grandTotal + ", numberOfOrderItems=" + numberOfOrderItems
				+ ", user=" + user + "]";
	}
}

