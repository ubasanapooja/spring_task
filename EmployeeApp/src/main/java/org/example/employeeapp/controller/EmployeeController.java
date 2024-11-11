package org.example.employeeapp.controller;

import org.example.employeeapp.model.Employee;
import org.example.employeeapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Display the form on the index page
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "index"; // Loads index.html from src/main/resources/templates
    }

    // Handle form submission and save employee
    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/displayAll"; // Redirect to display all employees after saving
    }

    // Display all employees
    @GetMapping("/displayAll")
    public String displayAllEmployees(Model model) {
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        return "displayAll"; // Loads displayAll.html
    }

    // Display a specific employee by ID
    @GetMapping("/display/{id}")
    public String displayEmployeeById(@PathVariable String id, Model model) {
        Optional<Employee> employee = employeeRepository.findById(id);
        employee.ifPresent(value -> model.addAttribute("employee", value));
        return "displayEmployee"; // Loads displayEmployee.html
    }
}
