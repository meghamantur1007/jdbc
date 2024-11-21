package com.xworkz.jdbc.constant;

public enum CompanyConstant {

	URL("jdbc:mysql://127.0.0.1:3306/company"), USERNAME("root"), PASSWORD("Megha@2002");

	private String value;

	private CompanyConstant(String value) {
		this.value=value;
	}

	public String getValue() {
		return value;
	}
}
