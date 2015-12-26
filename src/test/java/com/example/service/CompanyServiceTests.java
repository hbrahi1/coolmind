package com.example.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Company;

import junit.framework.Assert;

@Transactional
public class CompanyServiceTests extends AbstractTests{

	@Autowired
	protected CompanyService service;
	
//	@Before
//	public void setup(){
//		
//	}

	@Test
	public void save() {
		Company comp = service.createCompany();
		comp.setName("Zlabia");
		Company savedCompany = service.saveCompany(comp);
		assertEquals(comp.getName(), savedCompany.getName());
	}
	
	@Test
	public void getAll() {
		List<Company> companies = service.findAll();
		Assert.assertNotNull("expecting not null", companies);
		Assert.assertEquals(3, companies.size());
		
	}

	
}
