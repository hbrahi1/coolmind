package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Company;

public interface CompanyRepository extends CrudRepository<Company, Long>{

	public Company findByName(String name);
	
}
