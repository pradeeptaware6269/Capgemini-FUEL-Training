package com.example.Spring_6.service;

import com.example.Spring_6.model.Student;

public interface StudentService {

    public Student saveStudent(Student student);

   public  Student getStudent(Long id);

    public Student getdelete(Long id);

}
