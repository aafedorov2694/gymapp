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
	
	 @OneToMany(cascade = CascadeType.ALL, targetEntity = CustomerParameter.class)
	 private List<CustomerParameter> customerparam = new ArrayList<>();
	
	 @OneToMany(cascade = CascadeType.ALL)
	
	private List<Exercise> exercise = new ArrayList<>();
	
	 
	public Customer() {
		super();
			
	}
	
	
	


	public Customer(long cusId, String name, String birthDate, List<CustomerParameter> customerparam, List<Exercise> exercise) {
		super();
		this.cusId = cusId;
		this.name = name;
		this.birthDate = birthDate;
		this.customerparam = customerparam;
		this.exercise = exercise;
		
	}
	
	
	public long getCusId() {
		return cusId;
	}
	public void setCusId(long cusId) {
		this.cusId = cusId;
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

	public List<Exercise> getExercise() {
		return exercise;
	}


	public void setExercise(List<Exercise> exercise) {
		this.exercise = exercise;
	}





	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", name=" + name + ", birthDate=" + birthDate + ", customerparam="
				+ customerparam + ", exercise=" + exercise + "]";
	}


	


	
	
	
	



}


