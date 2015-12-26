package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_COMPANY")
public class Company extends BaseEntity{

	private static final long serialVersionUID = 6070814665149105944L;
	
	@Column(name="name",unique=true)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
