package com.example.EcommerceMiniProject.dto;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
public class TransactionCartDto {

	private String name;
	private Double price;
	private Integer subTotal;
	
	public TransactionCartDto(String name, Double price, Integer subTotal) {
		super();
		this.name = name;
		this.price = price;
		this.subTotal = subTotal;
	}

	public TransactionCartDto() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Integer subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "TransactionCartDto [name=" + name + ", price=" + price + ", subTotal=" + subTotal + "]";
	}

	
}
