package com.jpa.example.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * The persistent class for the empoyee database table.
 * 
 */
@Entity
@Table(name="empoyee")
@NamedQuery(name="Empoyee.findAll", query="SELECT e FROM Empoyee e")
public class Empoyee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;

	@Column(length=45)
	private String email;

	@Column(length=45)
	private String firstname;


	private String lastname;

	@Column(length=45)
	private String phone;

	//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="empoyee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Address> addresses;

	public Empoyee() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public Address addAddress(Address address) {
		
		if (this.addresses == null) {
			this.addresses = new HashSet<Address>();
		}
		getAddresses().add(address);
		address.setEmpoyee(this);

		return address;
	}

	public Address removeAddress(Address address) {
		getAddresses().remove(address);
		address.setEmpoyee(null);

		return address;
	}

}