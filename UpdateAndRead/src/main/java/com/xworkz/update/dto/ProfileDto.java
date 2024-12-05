package com.xworkz.update.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name="profile")

@NamedQueries({
		@NamedQuery(name="findByName", query="select pd from ProfileDto pd where pd.name='Madhu'"),
		@NamedQuery(name="findByEmail" ,query="select pd from ProfileDto pd where pd.email='Shalini@gmail.com'"),
		@NamedQuery(name="findByAge" ,query="select pd from ProfileDto pd where pd.age=22"),
		@NamedQuery(name="findByAddress" ,query="select pd from ProfileDto pd where pd.address='Mysore'"),
		@NamedQuery(name="findByNameAndPhone" ,query="select pd from ProfileDto pd where pd.name='Megha M' and pd.phoneNumber=9380916659"),
		@NamedQuery(name="findByNameAndEmail" ,query="select pd from ProfileDto pd where pd.name='Madhu' and pd.email='Madhuhs@gmail.com'"),
		@NamedQuery(name="findByPhoneAndAge" ,query="select pd from ProfileDto pd where pd.phoneNumber=8934526729 and pd.age=19"),
		@NamedQuery(name="findById",query="select pd from ProfileDto pd where pd.id=2"),	
		@NamedQuery(name="findByPhoneNumber",query="select pd from ProfileDto pd where pd.phoneNumber=8934526729"),
		@NamedQuery(name="findByNameAndAddress" ,query="select pd from ProfileDto pd where pd.name='Megha M' and pd.address='Bangalore'")

})


public class ProfileDto {
	@Id
	private int id;
	private String name;
	@Column(name = "phone_number")
	private long phoneNumber;
	private String email;
	private String address;
	private int age;
	private char gender;

	public ProfileDto() {
		super();
	}


	public ProfileDto(int id, String name, long phoneNumber, String email, String address, int age, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.age = age;
		this.gender = gender;
	}


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


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "ProfileDto [address=" + address + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", age=" + age + ", gender=" + gender + "]";
	}

}
