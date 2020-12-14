package com.example.AntonFedorovGym.Web;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.AntonFedorovGym.Model.Customer;
import com.example.AntonFedorovGym.Model.CustomerParameter;
import com.example.AntonFedorovGym.Model.CustomerParameterRepository;
import com.example.AntonFedorovGym.Model.CustomerRepository;
import com.example.AntonFedorovGym.Model.Exercise;
import com.example.AntonFedorovGym.Model.ExerciseRepository;




@Controller 
public class GymController {
	
	@Autowired
	private ExerciseRepository repository;
	@Autowired
	private CustomerRepository cusrep;
	@Autowired
	private CustomerParameterRepository cusparamrep;
	

	
	//----HomePage--//
	
	@GetMapping(value = {"/", "/homepage"})
	public String HomePage() {
		
		return "customerHomePage";
		
	}
	//------------Exercises------------------//
		
		@GetMapping(value = "/exerciselist")
		public String Programm(Model model) {
			model.addAttribute("anything", repository.findAll());
			return "exercises/diary";

}
				
		//addExercise//
		
		@RequestMapping(value = "/addExercise")
		public String addEx(@ModelAttribute Exercise exercise, Model model) {
			model.addAttribute("exercise", exercise);
			return "exercises/addExercise";
		}
		
		@RequestMapping(value = "/save", method = RequestMethod.POST)
		public String saveEx(@ModelAttribute Exercise exercise, Model model) {
			
			repository.save(exercise);
			return "redirect:/exerciselist";
			
		}
		
		
		//delete//
		@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
		
		public String deleteEx(@PathVariable("id") Long exId, Model model) {
			
			repository.deleteById(exId);
			
			return "redirect:../exerciselist";
			
		}
		
		//edit//
		
		@RequestMapping(value = "/modify/{id}", method = RequestMethod.GET)
		
		public String modifyEx(@PathVariable("id") Long exId, Model model) {
			
			Optional<Exercise> exercise = repository.findById(exId);
			model.addAttribute("exercise", exercise);
			
			return "exercises/modifyExercise";
		
		}
		
		
		
		
		
		
		//..........Customer..............//
		
		
		@GetMapping(value = {"/customer"})
		public String CustomerData(Model model) {
			model.addAttribute("anything", cusrep.findAll());
			return "customerview";
		
		}
		
		//AddCustomer//
		
		@RequestMapping(value = "/addcustomer")
		public String AddCustomer(Model model) {
			Customer customer = new Customer();
			String endpoint = "";
			
			if (cusrep.count() == 0) {
				model.addAttribute("customer", customer);
				endpoint = "addcustomer";
				
				} else {
					endpoint = "addparameters";
					
				}

			return endpoint;
			
		}
		
		@RequestMapping(value = "/savecustomer", method = RequestMethod.POST)
		public String SaveCustomer(Customer cus, Model model) {
			
			cusrep.save(cus);
			return "redirect:customer";
			
		}
		
		
	
		
		@RequestMapping(value = "/addparameter")
		public String UpdCustomer(@ModelAttribute CustomerParameter parameter, Model model) {
			
			model.addAttribute("parameter", parameter);
			return "addparameter";
			
		}
	
	
		//delete//
				
		@RequestMapping(value = "/deletecustomer/{id}", method = RequestMethod.GET)
				
				public String deleteCus(@PathVariable("id") Long cusId, Model model) {
					
					cusrep.deleteById(cusId);
					
					return "redirect:../customer";
					
				}
		
		//edit//
		
				@RequestMapping(value = "/editcustomer/{id}", method = RequestMethod.GET)
				
				public String modifyCus(@PathVariable("id") Long cusId, Model model) {
					
					Optional<Customer> customer = cusrep.findById(cusId);
					model.addAttribute("customer", customer);
					
					return "editcustomer";
				}
				
				
		
					
			
				
				
			
		
		
	
		
		
}
