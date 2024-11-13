package com.xworkz.jdbc.constant;

public enum LibraryConstant {
	URL("jdbc:mysql://127.0.0.1:3306/library"), USER("root"), PASSWORD("Megha@2002");

	private String value;

	private LibraryConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
