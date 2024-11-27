package com.xworkz.gym.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainers")
public class TrainersDto {
	@Id
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "phone_number")
	private long phoneNumber;
	@Column(name = "specialization")
	private String specialization;
	@Column(name = "experience_years")
	private int experienceYears;
	@Column(name = "salary")
	private double salary;
	@Column(name = "availability")
	private String availability;
	@Column(name = "certifications")
	private String certifications;

	public TrainersDto() {
		super();
	}

	public TrainersDto(int id, String firstName, String lastName, String email, long phoneNumber, String specialization,
			int experienceYears, double salary, String availability, String certifications) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.specialization = specialization;
		this.experienceYears = experienceYears;
		this.salary = salary;
		this.availability = availability;
		this.certifications = certifications;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getCertifications() {
		return certifications;
	}

	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}

	@Override
	public String toString() {
		return "TrainersDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", specialization=" + specialization + ", experienceYears="
				+ experienceYears + ", salary=" + salary + ", availability=" + availability + ", certifications="
				+ certifications + "]";
	}
	

}
