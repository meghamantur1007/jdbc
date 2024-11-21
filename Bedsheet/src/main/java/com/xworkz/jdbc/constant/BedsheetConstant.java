package com.xworkz.jdbc.constant;

public enum BedsheetConstant {
	
	URL("jdbc:mysql://127.0.0.1:3306/bedsheet"),USER("root"),PASSWORD("Megha@2002");
	
	private String value;

	private BedsheetConstant(String value) {
		this.value=value;
	}

	public String getValue() {
		return value;
	}
}
