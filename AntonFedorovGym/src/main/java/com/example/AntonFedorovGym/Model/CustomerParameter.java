package com.example.AntonFedorovGym.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class CustomerParameter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long paramId;
	private double weight;
	private double height;
	private String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	
	 @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 @JoinColumn(name = "cusId")
	 private Customer customer;
	
	public CustomerParameter() {
		
	}

	public CustomerParameter(double weight, double height, String date, Customer customer) {
		super();
		this.weight = weight;
		this.height = height;
		this.date = date;
		this.customer = customer;
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
