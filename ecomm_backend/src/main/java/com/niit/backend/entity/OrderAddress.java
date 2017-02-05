package com.niit.backend.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity(name = "ORDER_ADDRESSES")
@Component
public class OrderAddress implements Serializable {

	private static final long serialVersionUID = 1582885012544991135L;

	/*
	 * Private Fields
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDR_ID")
	private int id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORDER_ID")
	private Order order;

	@Column(name = "ADDR_FIRST_NAME")
	private String firstName;

	@Column(name = "ADDR_LAST_NAME")
	private String lastName;

	@Column(name = "ADDR_LINE_ONE")
	private String lineOne;

	@Column(name = "ADDR_LINE_TWO")
	private String lineTwo;

	@Column(name = "ADDR_LANDMARK")
	private String landmark;

	@Column(name = "ADDR_CITY")
	private String city;

	@Column(name = "ADDR_STATE")
	private String state;

	@Column(name = "ADDR_COUNTRY")
	private String country;

	@Column(name = "ADDR_PINCODE")
	private int pincode;

	@Column(name = "ADDR_MOBILE_NUMBER")
	private String mobileNumber;

	/*
	 * Getters and Setters OR Accessors and Mutators
	 */

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLineOne() {
		return lineOne;
	}

	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;
	}

	public String getLineTwo() {
		return lineTwo;
	}

	public void setLineTwo(String lineTwo) {
		this.lineTwo = lineTwo;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}

