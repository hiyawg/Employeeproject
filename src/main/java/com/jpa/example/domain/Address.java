package com.jpa.example.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * The persistent class for the address database table.
 * 
 */
@Entity
@Table(name="address")
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(length=45)
	private String city;

	@Column(length=45)
	private String state;

	@Column(length=45)
	private String street;

	private int zipcoed;

	//bi-directional many-to-one association to Empoyee
	@ManyToOne
	@JoinColumn(name="emp_id")
	@JsonBackReference
	private Empoyee empoyee;

	public Address() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZipcoed() {
		return this.zipcoed;
	}

	public void setZipcoed(int zipcoed) {
		this.zipcoed = zipcoed;
	}

	public Empoyee getEmpoyee() {
		return this.empoyee;
	}

	public void setEmpoyee(Empoyee empoyee) {
		this.empoyee = empoyee;
	}

}