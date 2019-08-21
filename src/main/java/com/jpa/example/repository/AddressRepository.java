package com.jpa.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.example.domain.Address;
import com.jpa.example.domain.Empoyee;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	Address findByEmpoyeeId(int id);

}
