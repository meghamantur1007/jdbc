package com.xworkz.travelAgency.runner;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking_details")

public class Booking_Details {

	@Id
	private int booking_id;
	private String customer_name;
	private String contact_number;
	private String email;
	private String destination;
	private String travel_date;
	private String return_date;
	private int number_of_travelers;
	private double total_cost;
	private String booking_status;

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTravel_date() {
		return travel_date;
	}

	public void setTravel_date(String travel_date) {
		this.travel_date = travel_date;
	}

	public String getReturn_date() {
		return return_date;
	}

	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}

	public int getNumber_of_travelers() {
		return number_of_travelers;
	}

	public void setNumber_of_travelers(int number_of_travelers) {
		this.number_of_travelers = number_of_travelers;
	}

	public double getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(double total_cost) {
		this.total_cost = total_cost;
	}

	public String getBooking_status() {
		return booking_status;
	}

	public void setBooking_status(String booking_status) {
		this.booking_status = booking_status;
	}

}
