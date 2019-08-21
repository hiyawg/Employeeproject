package com.jpa.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.example.domain.Address;
import com.jpa.example.domain.Empoyee;
import com.jpa.example.dto.EmployeeForm;
import com.jpa.example.dto.EmployeeSearch;
import com.jpa.example.service.EmployeeService;
import org.springframework.http.MediaType;


@RestController
@RequestMapping(path = "/employees",produces=MediaType.APPLICATION_JSON_VALUE )
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping
	public Empoyee regesterEmployee(@RequestBody EmployeeForm empdto){
		return employeeService.addEmployee(empdto);
	}
	
	@GetMapping
	public List<Empoyee> getEmployees(){
		return employeeService.findAllEmployees();
	}
	@PostMapping("/search")
	public List<Empoyee> getEmployeesBylastnamedob(@RequestBody EmployeeSearch empdto){
		
		
		return employeeService.searchByLastNameAndDob(empdto);
	}
	@GetMapping("/{id}")
	public Empoyee getEmployeeByID(@PathVariable int id){
		return employeeService.findEmployeeById(id);
	}
	@GetMapping("/address/{id}")
	public Address getPatientAddress(@PathVariable int id){
		return employeeService.getEmployeeAddress(id);
	}

}
