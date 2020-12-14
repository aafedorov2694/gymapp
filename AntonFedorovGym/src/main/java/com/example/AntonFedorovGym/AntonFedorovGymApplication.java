package com.example.AntonFedorovGym;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AntonFedorovGym.Model.CustomerParameter;
import com.example.AntonFedorovGym.Model.Exercise;
import com.example.AntonFedorovGym.Model.ExerciseRepository;



@SpringBootApplication
public class AntonFedorovGymApplication {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(AntonFedorovGymApplication.class, args);
		
	}
		
	 @Bean

     public CommandLineRunner runner(){
        return args -> {
        	
        	
        	
          	
        
        	
        };
}
}
