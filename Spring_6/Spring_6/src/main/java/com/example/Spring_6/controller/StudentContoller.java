package com.example.Spring_6.controller;

import com.example.Spring_6.model.Student;
import com.example.Spring_6.studentserviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentContoller {

    @Autowired
    private StudentServiceImpl studentService;

    // Create Student
    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    // Get Student by ID
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);
    }

    // Delete Student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.getdelete(id);
        return "The data deleted successfully with ID: " + id;
    }

    // Update Student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student) {
        student.setId(id);
        return studentService.saveStudent(student);
    }
}