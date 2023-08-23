package com.example.EcommerceMiniProject.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.EcommerceMiniProject.dto.TransactionCartDto;
import com.example.EcommerceMiniProject.dto.TransactionProductDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Table(name="cartItem")
public class CartItem {

//	@EmbeddedId
//	private CartItemId id;
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer id;	
	private Integer count;
	@Embedded
	private TransactionCartDto transactionCartDto;

	public CartItem(Integer id, Integer count, TransactionCartDto transactionCartDto) {
		super();
		this.id = id;
		this.count = count;
		this.transactionCartDto = transactionCartDto;
	}

	public CartItem() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public TransactionCartDto getTransactionCartDto() {
		return transactionCartDto;
	}

	public void setTransactionCartDto(TransactionCartDto transactionCartDto) {
		this.transactionCartDto = transactionCartDto;
	}

	@Override
	public String toString() {
		return "CartItem [id=" + id + ", count=" + count + ", transactionCartDto=" + transactionCartDto + "]";
	}




	
//	@Embedded
//	private TransactionProductDto transactionProductDto;

	
//	@OneToMany
//	@JoinColumn(name="productnew_id")
//	private Set<Product> product = new HashSet<>();

	

	
}
