package com.example.AntonFedorovGym.Model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import javassist.expr.NewArray;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cusId;
	private String name;
	private String birthDate;
	
	 @OneToMany(cascade=CascadeType.ALL, mappedBy="customer")
	 private List<CustomerParameter> customerparam;
	
	 @OneToMany(cascade = CascadeType.ALL, mappedBy="customer")
	private List<Exercise> exercise;
	
	 
	public Customer() {	
	}
	
	
	public Customer(String name, String birthDate) {
		super();
		
		this.name = name;
		this.birthDate = birthDate;
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	

	public List<CustomerParameter> getCustomerparam() {
		return customerparam;
	}


	public void setCustomerparam(List<CustomerParameter> customerparam) {
		this.customerparam = customerparam;
	}


	public long getCusId() {
		return cusId;
	}


	public void setCusId(long cusId) {
		this.cusId = cusId;
	}


	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", name=" + name + ", birthDate=" + birthDate + "]";
	}


	


	
	
	
	



}


