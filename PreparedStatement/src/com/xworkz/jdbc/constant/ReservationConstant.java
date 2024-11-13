package com.xworkz.jdbc.constant;

public enum ReservationConstant {
	URL("jdbc:mysql://127.0.0.1:3306/hotel_reservation"), USER("root"), PASSWORD("Megha@2002");

	private String value;

	private ReservationConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
