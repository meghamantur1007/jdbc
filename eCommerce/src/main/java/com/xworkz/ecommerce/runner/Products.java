package com.xworkz.ecommerce.runner;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")

public class Products {
	
	@Id
	private int product_id;
	private String product_name;
	private String category;
	private String brand;
	private double price;
	private int stock_quantity;
	private String supplier_name;
	private String supplier_contact;
	private double discount_percentage;
	private boolean is_active;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock_quantity() {
		return stock_quantity;
	}

	public void setStock_quantity(int stock_quantity) {
		this.stock_quantity = stock_quantity;
	}

	public String getSupplier_name() {
		return supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public String getSupplier_contact() {
		return supplier_contact;
	}

	public void setSupplier_contact(String supplier_contact) {
		this.supplier_contact = supplier_contact;
	}

	public double getDiscount_percentage() {
		return discount_percentage;
	}

	public void setDiscount_percentage(double discount_percentage) {
		this.discount_percentage = discount_percentage;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

}
