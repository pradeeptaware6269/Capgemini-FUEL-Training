package com.example.Spring_6.studentserviceImpl;

import com.example.Spring_6.model.Student;
import com.example.Spring_6.repository.StudentRepository;
import com.example.Spring_6.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

@Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student getdelete(Long id) {
        studentRepository.deleteById(id);

        return null;
    }
}
