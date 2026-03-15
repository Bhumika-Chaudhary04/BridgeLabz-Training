package com.healthclinic.model;

public class Doctor {

	private String name;
	private String specialization;
	private String contact;
	private double fee;

	public Doctor(String name, String specialization, String contact, double fee) {
		this.name = name;
		this.specialization = specialization;
		this.contact = contact;
		this.fee = fee;
	}

	public String getName() {
		return name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public String getContact() {
		return contact;
	}

	public double getFee() {
		return fee;
	}
}