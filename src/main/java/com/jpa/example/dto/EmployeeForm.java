package com.jpa.example.dto;

import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeeForm {
	
	
	@JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
	private Date empdob;

     private String empemail;

	
	private String empfirstname;

	
	private String emplastname;

	
	private String empphone;
	
	
	private String empcity;

	
	private String empstate;

	
	private String empstreet;

	private int empzipcoed;


	public Date getEmpdob() {
		return empdob;
	}

	public void setEmpdob(Date empdob) {
		this.empdob = empdob;
	}

	public String getEmpemail() {
		return empemail;
	}

	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	public String getEmpfirstname() {
		return empfirstname;
	}

	public void setEmpfirstname(String empfirstname) {
		this.empfirstname = empfirstname;
	}

	public String getEmplastname() {
		return emplastname;
	}

	public void setEmplastname(String emplastname) {
		this.emplastname = emplastname;
	}

	public String getEmpphone() {
		return empphone;
	}

	public void setEmpphone(String empphone) {
		this.empphone = empphone;
	}

	public String getEmpcity() {
		return empcity;
	}

	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}

	public String getEmpstate() {
		return empstate;
	}

	public void setEmpstate(String empstate) {
		this.empstate = empstate;
	}

	public String getEmpstreet() {
		return empstreet;
	}

	public void setEmpstreet(String empstreet) {
		this.empstreet = empstreet;
	}

	public int getEmpzipcoed() {
		return empzipcoed;
	}

	public void setEmpzipcoed(int empzipcoed) {
		this.empzipcoed = empzipcoed;
	}

	

}
