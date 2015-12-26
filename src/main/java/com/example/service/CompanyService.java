package com.example.service;

import java.util.List;

import com.example.model.Company;

public interface CompanyService {

		public Company createCompany();
		public Company saveCompany(Company company);
		public Company findByName(String name);
		public List<Company> findAll();
	
}
