package com.xworkz.jdbc.constants;

public enum EvenetManagementConstant {
	URL("jdbc:mysql://127.0.0.1:3306/event_management"), USER("root"), PASSWORD("Megha@2002");

	private String value;

	private EvenetManagementConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}