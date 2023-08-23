package com.example.EcommerceMiniProject.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Table;

import lombok.Data;

@Data
@Embeddable
@Table(name="cartItemId")
public class CartItemId implements Serializable {
	private String idCart;
	private String idProduct;
	
	public CartItemId(String idCart, String idProduct) {
		super();
		this.idCart = idCart;
		this.idProduct = idProduct;
	}

	public CartItemId() {
		super();
	}

	public String getIdCart() {
		return idCart;
	}

	public void setIdCart(String idCart) {
		this.idCart = idCart;
	}

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	@Override
	public String toString() {
		return "CartItemId [idCart=" + idCart + ", idProduct=" + idProduct + "]";
	}
	
	
}
