package com.sapient.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sapient.springdemo.model.Employee;
import com.sapient.springdemo.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class RegisterController {
	
	@Autowired
	private EmployeeService employeeService;
    
	@GetMapping("/login")
    public String login(){
        return "login";
    }
    
    @GetMapping("/display")
    public String display(Model model){
        List<Employee> el = employeeService.fetchAllEmployees();
        model.addAttribute("el", el);
        el.forEach(e -> System.out.println(e));
        return "display";
    }
    
    @GetMapping("/register")
    public String register(){
    	return "register";
    }
    
    @GetMapping("/{id}")
    public String findEmployee(@PathVariable("id") int id, Model model) {
    	
    	Employee e = employeeService.findById(id);
    	model.addAttribute("emp", e);
    	return "employee";
    }
}