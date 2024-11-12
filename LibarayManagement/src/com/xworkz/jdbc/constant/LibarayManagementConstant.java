package com.xworkz.jdbc.constant;

public enum LibarayManagementConstant {
	URL("jdbc:mysql://127.0.0.1:3306/library_management"), USER("root"), PASSWORD("Megha@2002");

	private String value;

	private LibarayManagementConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
