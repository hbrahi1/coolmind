package com.example.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.CoolmindApplication;
import com.example.model.Company;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=CoolmindApplication.class)
public abstract class AbstractTests {

	   protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
		

}
