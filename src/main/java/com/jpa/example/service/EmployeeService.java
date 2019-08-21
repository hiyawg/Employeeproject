package com.jpa.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.example.domain.Address;
import com.jpa.example.domain.Empoyee;
import com.jpa.example.dto.EmployeeForm;
import com.jpa.example.dto.EmployeeSearch;
@Service
public interface EmployeeService {
	
	Empoyee addEmployee(EmployeeForm empdto);
	List<Empoyee> findAllEmployees();
	List<Empoyee> searchByLastNameAndDob(EmployeeSearch empdto);
	Empoyee findEmployeeById(int id);
	Address getEmployeeAddress(int id);

}
