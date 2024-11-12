package com.xworkz.jdbc.constants;

public enum BankConstant {
	URL("jdbc:mysql://127.0.0.1:3306/bank_account"), USER("root"), PASSWORD("Megha@2002");

	private String value;

	private BankConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}