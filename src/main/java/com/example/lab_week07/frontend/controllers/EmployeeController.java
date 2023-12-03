package com.example.lab_week07.frontend.controllers;


import com.example.lab_week07.backend.enums.EmployeeStatus;
import com.example.lab_week07.backend.models.Employee;
import com.example.lab_week07.backend.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping("/listEmployee")
    public String showCustomerList(Model model){
        model.addAttribute("employeeList", employeeRepository.findAll());
        return "employee/list";
    }

    @GetMapping("/insertEmployee")
    public String showFormAddEmployee(ModelMap modelMap){
        Employee employee = new Employee();
        modelMap.addAttribute("employee", employee);
        return "employee/add-employee";
    }

    @PostMapping("/insertEmployee")
    public String addEmployee(ModelMap modelMap, @ModelAttribute("employee") Employee employee){
        employee.setStatus(EmployeeStatus.ACTIVE);
        employeeRepository.save(employee);
        return "redirect:/listEmployee";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(ModelMap modelMap,@PathVariable("id") long id){
        Optional<Employee> employee = employeeRepository.findById(id);
        employeeRepository.delete(employee.get());
        return "redirect:/listEmployee";
    }

    @GetMapping("/update/{id}")
    public String showFormUpdateEmployee(ModelMap modelMap, @PathVariable("id") long id){
        Optional<Employee> employee = employeeRepository.findById(id);
        modelMap.addAttribute("employee", employee.get());
        return "employee/update-employee";
    }

    @PostMapping("/update/{id}")
    public String updateEmployee(@ModelAttribute("employee") Employee employee){
        employee.setStatus(EmployeeStatus.ACTIVE);
        employeeRepository.save(employee);
        return "redirect:/listEmployee";
    }
}
