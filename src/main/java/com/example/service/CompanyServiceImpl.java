package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Company;
import com.example.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository repo;
	
	@Override
	public Company createCompany() {
		return new Company();
	}

	@Override
	public Company saveCompany(Company company) {
		return repo.save(company);
	}

	@Override
	public Company findByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public List<Company> findAll() {
		
		List<Company> list = new ArrayList<Company>();
		Iterable<Company> iter = repo.findAll();
		iter.iterator().forEachRemaining(list::add);
		return list;
	}

}
