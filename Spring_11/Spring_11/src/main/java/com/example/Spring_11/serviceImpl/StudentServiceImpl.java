package com.example.Spring_11.serviceImpl;

import com.example.Spring_11.model.Student;
import com.example.Spring_11.repository.StudentRepository;
import com.example.Spring_11.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Long id, Student student) {

        Student existing = repository.findById(id).orElse(null);

        if (existing != null) {

            existing.setName(student.getName());
            existing.setMarks(student.getMarks());
            existing.setCourse(student.getCourse());
            existing.setEmail(student.getEmail());

            return repository.save(existing);
        }

        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}