package com.example.EcommerceMiniProject.dto;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Embeddable
public class TransactionProductDto {

	private String dateTime;
	private String paymentMethod;
	private String deliveryMethod;
	public TransactionProductDto(String dateTime, String paymentMethod, String deliveryMethod) {
		super();
		this.dateTime = dateTime;
		this.paymentMethod = paymentMethod;
		this.deliveryMethod = deliveryMethod;
	}
	public TransactionProductDto() {
		super();
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	@Override
	public String toString() {
		return "TransactionProductDto [dateTime=" + dateTime + ", paymentMethod=" + paymentMethod + ", deliveryMethod="
				+ deliveryMethod + "]";
	}
}
