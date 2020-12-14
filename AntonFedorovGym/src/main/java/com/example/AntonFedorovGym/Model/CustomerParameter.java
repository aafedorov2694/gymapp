package com.example.AntonFedorovGym.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CustomerParameter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long paramId;
	private double weight;
	private double height;
	private String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	
	 @ManyToOne(targetEntity = Customer.class)
	 @JoinColumn(name = "cusId", referencedColumnName = "cusId")
	 private Customer customer;
	
	public CustomerParameter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerParameter(long paramId, double weight, double height, String date, Customer customer) {
		super();
		this.paramId = paramId;
		this.weight = weight;
		this.height = height;
		this.date = date;
		this.customer = customer;
	}
	
	public long getParamId() {
		return paramId;
	}

	public void setParamId(long paramId) {
		this.paramId = paramId;
	}


	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerParameter [paramId=" + paramId + ", weight=" + weight + ", height=" + height + ", date=" + date
				+ ", customer=" + customer + "]";
	}

	
	
	
	
	
}
