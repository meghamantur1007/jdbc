package com.xworkz.jdbc.constants;

public enum UserAccountConstant {
	URL("jdbc:mysql://127.0.0.1:3306/user_account"), USER("root"), PASSWORD("Megha@2002");

	private String value;

	private UserAccountConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}