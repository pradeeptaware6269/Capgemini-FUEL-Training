package com.example.Spring2.serviceImpl;

import com.example.Spring2.exception.StudentNotFoundException;
import com.example.Spring2.model.Student;
import com.example.Spring2.model.User;
import com.example.Spring2.repository.StudentRepo;
import com.example.Spring2.repository.UserRepo;
import com.example.Spring2.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.StubNotFoundException;
import java.util.Optional;

@Service
public class StudentserviceImpl implements Studentservice {

    @Autowired
    public StudentRepo studentrepo;

    @Override
    public Student saveStudent(Student student) {

        return studentrepo.save(student);
    }

    @Override
    public Student getStudent(Long id)
    {
        return studentrepo.findById(id).orElseThrow(() -> new StudentNotFoundException("Not found ID so we cant moving the forword ... : "+id));
    }

    @Override
    public void deleteStudent(Long id)
    {
       Student student=studentrepo.findById(id).orElseThrow(()-> new StudentNotFoundException("Here that id is not present Thats why we are not able to delete it .... the id is : "+id));
       studentrepo.deleteById(id);
    }
}
