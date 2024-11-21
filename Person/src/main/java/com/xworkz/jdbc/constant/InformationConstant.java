package com.xworkz.jdbc.constant;

public enum InformationConstant {

	URL("jdbc:mysql://127.0.0.1:3306/person_information"), USERNAME("root"), PASSWORD("Megha@2002");

	private String value;

	private InformationConstant(String value) {
		this.value=value;
	}

	public String getValue() {
		return value;
	}
}