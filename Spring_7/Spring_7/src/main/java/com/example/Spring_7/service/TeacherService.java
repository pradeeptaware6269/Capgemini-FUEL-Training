package com.example.Spring_7.service;

import com.example.Spring_7.model.Teacher;

public interface TeacherService {

    Teacher saveTeacher(Teacher teacher);
    Teacher getTeacher(Long id);
    void getDelete(Long id);
}
