package com.xworkz.jdbc.constant;

public enum ProductConstant {
	URL("jdbc:mysql://127.0.0.1:3306/product_inventory"), USER("root"), PASSWORD("Megha@2002");

	private String value;

	private ProductConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
