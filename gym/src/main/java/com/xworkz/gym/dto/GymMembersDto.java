package com.xworkz.gym.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gym_members")
public class GymMembersDto {

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
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;
	@Column(name = "gender")
	private String gender;
	@Column(name = "membership_start")
	private LocalDate membershipStart;
	@Column(name = "membership_end")
	private String membershipEnd;
	@Column(name = "membership_type")
	private String membershipType;
	
	public GymMembersDto() {
		super();
	}

	public GymMembersDto(int id, String firstName, String lastName, String email, long phoneNumber,
			LocalDate dateOfBirth, String gender, LocalDate membershipStart, String membershipEnd,
			String membershipType) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.membershipStart = membershipStart;
		this.membershipEnd = membershipEnd;
		this.membershipType = membershipType;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getMembershipStart() {
		return membershipStart;
	}

	public void setMembershipStart(LocalDate membershipStart) {
		this.membershipStart = membershipStart;
	}

	public String getMembershipEnd() {
		return membershipEnd;
	}

	public void setMembershipEnd(String membershipEnd) {
		this.membershipEnd = membershipEnd;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	@Override
	public String toString() {
		return "GymMembersDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", membershipStart=" + membershipStart + ", membershipEnd=" + membershipEnd + ", membershipType="
				+ membershipType + "]";
	}

	
}