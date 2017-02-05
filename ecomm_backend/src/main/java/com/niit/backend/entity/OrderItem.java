package com.niit.backend.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity(name = "ORDER_ITEMS")
@Component
public class OrderItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9027358021451176117L;

	/*
	 * Private Fields
	 */

	@Id
	@Column(name = "ITEM_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;

	@Column(name = "ITEM_QUANTITY")
	private int quantity;

	@Column(name = "ITEM_PRICE")
	private int itemPrice;

	@Column(name = "ITEM_TOTAL")
	private int totalPrice;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ORDER_ID")
	private Order order;

	/*
	 * Getter And Setters / Accessors And Mutators
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", product=" + product + ", quantity=" + quantity + ", itemPrice=" + itemPrice
				+ ", totalPrice=" + totalPrice + ", order=" + order + "]";
	}

}

