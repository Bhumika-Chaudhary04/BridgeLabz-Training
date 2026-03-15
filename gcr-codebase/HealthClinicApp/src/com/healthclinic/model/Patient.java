package com.healthclinic.model;

public class Patient {

	private String name;
	private String dob;
	private String phone;
	private String email;
	private String address;
	private String bloodGroup;

	public Patient(String name, String dob, String phone, String email, String address, String bloodGroup) {
		this.name = name;
		this.dob = dob;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.bloodGroup = bloodGroup;
	}

	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}
}