package com.example.AntonFedorovGym.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



 @Entity 
public class Exercise {
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private long exId;
	private String name;
	
	
	@ManyToOne( targetEntity = Customer.class)
	@JoinColumn(name = "cusId", referencedColumnName = "cusId")
	private Customer customer;
	
	@OneToMany(cascade=CascadeType.ALL, targetEntity = ExerciseStat.class)
	private List<ExerciseStat> exstat = new ArrayList<>();
	
	public Exercise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Exercise(long exId, String name, Customer customer, List<ExerciseStat> exstat) {
		
		this.exId = exId;
		this.name = name;
		this.customer = customer;
		this.exstat = exstat;
		
	}


	
	


	public long getExId() {
		return exId;
	}


	public void setExId(long exId) {
		this.exId = exId;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public List<ExerciseStat> getExstat() {
		return exstat;
	}


	public void setExstat(List<ExerciseStat> exstat) {
		this.exstat = exstat;
	}


	@Override
	public String toString() {
		return "Exercise [exId=" + exId + ", name=" + name + ", customer=" + customer + ", exstat=" + exstat + "]";
	}
	



	
	
	
}
