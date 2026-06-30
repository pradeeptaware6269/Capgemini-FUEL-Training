package com.example.Spring10.controller;

import com.example.Spring10.Repository.EmployeeRepo;
import com.example.Spring10.model.Employee;
import com.example.Spring10.model.User;
import com.example.Spring10.serviceImpl.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class Employeecontroller {


    @Autowired
    private EmployeeServiceImp employeeserviceImp;


    @Autowired
    private EmployeeRepo employeeRepo;


    @PostMapping
    public Employee createUser(@RequestBody Employee employee) {
        return employeeserviceImp.saveEmployee(employee);
    }


    @GetMapping("/{id}")
    public Employee getData(@PathVariable Long id) {
        try {
            Optional<Employee> employee = employeeRepo.findById(id);

            if (employee.isPresent()) {
                return employee.get();
            }

            throw new RuntimeException("Employee not found");

        } catch (RuntimeException e) {
            System.out.println("The exception is: " + e.getMessage());
            return null;
        } finally {
            System.out.println("I am Always Execute.....");
        }
    // return employeeserviceImp.getEmployee(id);
}



    @DeleteMapping("/{id}")
    public String getdelete(@PathVariable Long id)
    {
        employeeserviceImp.deleteEmployee(id);
        return "The Employee data is Deleted successfully  :"+id;
    }

    @PutMapping("/{id}")
    public Employee getUpdate(@RequestBody Employee employee,@PathVariable Long id)
    {
        employee.setId(id);
        return employeeserviceImp.saveEmployee(employee);
    }
}
