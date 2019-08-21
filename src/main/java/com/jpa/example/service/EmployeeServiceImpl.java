package com.jpa.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.example.domain.Address;
import com.jpa.example.domain.Empoyee;
import com.jpa.example.dto.EmployeeForm;
import com.jpa.example.dto.EmployeeSearch;
import com.jpa.example.repository.AddressRepository;
import com.jpa.example.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeRepo;
	@Autowired
	AddressRepository addressRepo;
	
	
	@Override
	public Empoyee addEmployee(EmployeeForm empdto) {
		Empoyee employee =  CreateEmployee( empdto);
		employeRepo.save(employee);
		return employee;
	}

	
	@Transactional
	public Empoyee CreateEmployee(EmployeeForm empdto) {
		Empoyee employee = new Empoyee();
		//get employee data from the form
		employee.setFirstname(empdto.getEmpfirstname());
		employee.setLastname(empdto.getEmplastname());
		employee.setDob(empdto.getEmpdob());
		employee.setEmail(empdto.getEmpemail());
		employee.setPhone(empdto.getEmpphone());
		
		//get employee data from  address
		  Address address = new Address();
		  address.setStreet(empdto.getEmpstreet());
		  address.setCity(empdto.getEmpcity());
		  address.setState(empdto.getEmpstate());
		  address.setZipcoed(empdto.getEmpzipcoed());
		  
		  employee.addAddress(address);
		 
	      
		return employee;
	}


	@Override
	public List<Empoyee> findAllEmployees() {
		
		return employeRepo.findAll();
	}


	@Override
	public List<Empoyee> searchByLastNameAndDob(EmployeeSearch empdto) {
		// TODO Auto-generated method stub
		return employeRepo.findByLastnameAndDob(empdto.getLastName(),empdto.getDob());
	}


	@Override
	public Empoyee findEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeRepo.findById(id).orElse(null);
	}


	@Override
	public Address getEmployeeAddress(int id) {
		// TODO Auto-generated method stub
		return addressRepo.findByEmpoyeeId(id);
	}






	

}
