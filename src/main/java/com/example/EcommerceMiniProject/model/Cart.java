package com.example.EcommerceMiniProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String dateTime; 
	private Integer subTotal;
	private String paidStatus;
	private String deliveryMethod;
	private String paymentMethod;
	
	public Cart(Integer id, String username, String dateTime, Integer subTotal, String paidStatus, String deliveryMethod,
			String paymentMethod) {
		super();
		this.id = id;
		this.username = username;
		this.dateTime = dateTime;
		this.subTotal = subTotal;
		this.paidStatus = paidStatus;
		this.deliveryMethod = deliveryMethod;
		this.paymentMethod = paymentMethod;
	}

	public Cart() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public Integer getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Integer subTotal) {
		this.subTotal = subTotal;
	}

	public String getPaidStatus() {
		return paidStatus;
	}

	public void setPaidStatus(String paidStatus) {
		this.paidStatus = paidStatus;
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", username=" + username + ", dateTime=" + dateTime + ", subTotal=" + subTotal
				+ ", paidStatus=" + paidStatus + ", deliveryMethod=" + deliveryMethod + ", paymentMethod="
				+ paymentMethod + "]";
	}
	
	
}
