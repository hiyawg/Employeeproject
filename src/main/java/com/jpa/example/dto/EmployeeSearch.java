package com.jpa.example.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeeSearch {
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	private String lastName;
	@JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
	private Date dob;

}
