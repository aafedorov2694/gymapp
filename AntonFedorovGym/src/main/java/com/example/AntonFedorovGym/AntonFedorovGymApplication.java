package com.example.AntonFedorovGym;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AntonFedorovGym.Model.Customer;
import com.example.AntonFedorovGym.Model.CustomerParameter;
import com.example.AntonFedorovGym.Model.CustomerParameterRepository;
import com.example.AntonFedorovGym.Model.CustomerRepository;
import com.example.AntonFedorovGym.Model.Exercise;
import com.example.AntonFedorovGym.Model.ExerciseRepository;



@SpringBootApplication
public class AntonFedorovGymApplication {
	@Autowired
	private CustomerRepository cusrep;
	
	@Autowired
	private CustomerParameterRepository cusparamrep;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AntonFedorovGymApplication.class, args);
		
	}
		
	 @Bean

     public CommandLineRunner runner(){
        return args -> {
        	
        
        	
        	/*Customer customer = new Customer("Anton", "26-09-1994");
        	cusrep.save(customer);
        	
        	CustomerParameter param = new CustomerParameter(100, 180, "26-01-2012", customer);
        	cusparamrep.save(param);*/
        
        	
        	
        	
        	
          	
        
        	
        };
}
}
