package com.xworkz.jdbc.dto;

public class InformationDto {

	private String name;
	private String email;
	private long phone_number;
	private String address;

	public InformationDto(String name, String email, long phone_number, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}