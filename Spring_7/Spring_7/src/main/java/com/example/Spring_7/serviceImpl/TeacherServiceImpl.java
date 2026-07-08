package com.example.Spring_7.serviceImpl;

import com.example.Spring_7.model.Teacher;
import com.example.Spring_7.repository.TeacherRepo;
import com.example.Spring_7.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    @Override
    public Teacher getTeacher(Long id) {
        return teacherRepo.findById(id).orElse(null);
    }

    @Override
    public void getDelete(Long id) {
        teacherRepo.deleteById(id);
    }
}
