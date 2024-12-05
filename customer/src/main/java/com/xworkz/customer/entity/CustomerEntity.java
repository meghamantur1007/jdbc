package com.xworkz.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="customer_table")
@NamedQuery(name="findAll",query="select ct from CustomerEntity ct")
@NamedQuery(name="findNameByPhone",query="select ct.name from CustomerEntity ct where ct.phoneNumber=: byphone")
@NamedQuery(name="findPhoneByName",query="select ct.phoneNumber from CustomerEntity ct where ct.name=: byName")
@NamedQuery(name="findBalanceByName",query="select ct.balance from CustomerEntity ct where ct.name=: byName")
@NamedQuery(name="findDiscountById",query="select ct.discount from CustomerEntity ct where ct.id=: byId")

public class CustomerEntity {
	@Id
	@Column(name="id")
	private int id;
	private String name;
	private float balance;
	private double discount;
	@Column(name="phone_number")
	private long phoneNumber;
	
	public CustomerEntity() {
		super();
	}
	
	public CustomerEntity(int id, String name, float balance, double discount, long phone_number) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.discount = discount;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public long getPhone_number() {
		return phoneNumber;
	}

	public void setPhone_number(long phone_number) {
		this.phoneNumber = phone_number;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", balance=" + balance + ", discount=" + discount
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	

}
