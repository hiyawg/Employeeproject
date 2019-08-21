package com.jpa.example.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.example.domain.Empoyee;
@Repository
public interface EmployeeRepository extends JpaRepository<Empoyee, Integer> {
	
	   List<Empoyee> findByLastnameAndDob(String lastName,Date dob);

}
