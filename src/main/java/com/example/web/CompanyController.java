package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Company;
import com.example.service.CompanyService;

@RestController
@RequestMapping("/companies")
public class CompanyController {

	@Autowired
	private CompanyService service;
	
	@RequestMapping("/all")
	public List<Company> index() {
		return service.findAll();
	}
	
}
