package com.xworkz.clinic.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctors_table")
public class DoctorDto {

	@Id
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "specialization")
	private String specialization;
	@Column(name = "phone_number")
	private long phoneNumber;
	@Column(name = "available_days")
	private int availableDays;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAvailableDays() {
		return availableDays;
	}

	public void setAvailableDays(int availableDays) {
		this.availableDays = availableDays;
	}

}
