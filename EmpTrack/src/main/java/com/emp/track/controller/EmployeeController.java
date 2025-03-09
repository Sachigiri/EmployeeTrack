package com.emp.track.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.emp.track.model.Employee;
import com.emp.track.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        // Pass the list of employees to the Thymeleaf template
        model.addAttribute("listEmployees", employeeService.getAllEmployees());
        return "index";  // This corresponds to index.html template
    }
    @GetMapping("/showNewEmployeeForm")
     public String showNewEmployeeForm(Model model) {
    	Employee employee=new Employee();//thymleaf template will access this empty employee object for binding form data
    	model.addAttribute("employee",employee);
    	return "new_employee";
    	
    	
    	//employeeService.save(employee);
    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employe") Employee employee) {
    	//save employee to db
    	employeeService.save(employee);
    	return "redirect:/";//redirect to home page
    }
    
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormUpdate(@PathVariable(value="id")long id,Model model) {
    	//get eployee fro m the srevice
    	Employee employee=employeeService.getEmployeeById(id);
    	model.addAttribute("employee",employee);
    	return "update_employee";
    	
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(value="id")long id) {
    	//get eployee fro m the srevice
    	this.employeeService.delete(id);
    	return "redirect:/";
    
    	
    }
  
    
}
