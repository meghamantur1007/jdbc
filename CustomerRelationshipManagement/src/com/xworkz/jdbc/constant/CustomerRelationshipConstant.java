package com.xworkz.jdbc.constant;

public enum CustomerRelationshipConstant {

	URL("jdbc:mysql://127.0.0.1/customer_relationship_management"),USERNAME("root"),PASSWORD("Megha@2002");
	
	private String value;
	
	private CustomerRelationshipConstant(String value) {
		this.value=value;
	}

	public String getValue() {
		return value;
	}
	
	
}
