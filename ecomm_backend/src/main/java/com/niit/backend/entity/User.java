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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity(name = "USERS")
@Component
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 268202102157628071L;

	/*
	 * Declaring Private Fields
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private int id;
	@Column(name = "USER_EMAIL")
	private String email;
	@Column(name = "USER_PASSWORD")
	private String password;
	@Transient
	private String confirmPassword;
	@Transient
	private String oldPassword;
	@Column(name = "USER_FIRST_NAME")
	private String firstName;
	@Column(name = "USER_LAST_NAME")
	private String lastName;
	@Column(name = "USER_GENDER")
	private String gender;
	@Column(name = "USER_MOBILE_NUMBER")
	private String mobileNumber;
	@Transient
	private String tempMobileNumber;

	@JoinColumn(name = "CART_ID")
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Cart cart;

	@Column(name = "USER_ENABLED")
	private boolean enabled;

	@PrimaryKeyJoinColumn(name = "ORDER_ID")
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private Set<Order> orders;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Address> address;

	@Column(name = "USER_ROLE")
	private String role;

	/*
	 * Getters And Setters or Accessors and Mutators
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getTempMobileNumber() {
		return tempMobileNumber;
	}

	public void setTempMobileNumber(String tempMobileNumber) {
		this.tempMobileNumber = tempMobileNumber;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	/*
	 * Override toString Method for Debugging Purpose
	 */

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", oldPassword=" + oldPassword + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", mobileNumber=" + mobileNumber + ", tempMobileNumber=" + tempMobileNumber + ", cart="
				+ cart + ", enabled=" + enabled + ", role=" + role + "]";
	}

}			
