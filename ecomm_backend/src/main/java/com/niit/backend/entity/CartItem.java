package com.niit.backend.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity(name = "CART_ITEMS")
@Component
public class CartItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4656864328651257095L;

	/*
	 * Private Fields
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ITEM_ID")
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

	@ManyToOne
	@JoinColumn(name = "CART_ID")
	private Cart cart;

	/*
	 * Getters and Setters
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

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		//To get the total price if the quantity increased
		this.totalPrice = getQuantity()*getItemPrice();
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	/*
	 * Overriding toString Method For Debugging
	 */

	/*@Override
	public String toString() {
		return "CartItem [id=" + id + ", product=" + product + ", quantity=" + quantity + ", itemPrice=" + itemPrice
				+ ", totalPrice=" + totalPrice + ", cart=" + cart + "]";
	}*/

}



