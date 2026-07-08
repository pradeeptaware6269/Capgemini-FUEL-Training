package com.example.Spring_7.controller;

import com.example.Spring_7.model.Teacher;
import com.example.Spring_7.repository.TeacherRepo;
import com.example.Spring_7.serviceImpl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherServiceImpl teacherService;

    @PostMapping
    public Teacher saveData(@RequestBody Teacher teacher)
    {
        return  teacherService.saveTeacher(teacher);
    }

    @GetMapping("/{id}")
    public Teacher getData(@PathVariable Long id)
    {
        return teacherService.getTeacher(id);
    }

    @DeleteMapping("/{id}")
    public String getDelete(@PathVariable Long id)
    {
        teacherService.getDelete(id);
        return "The Teacher data is Deleted is Successfully :"+id;
    }

    @PutMapping("/{id}")
    public Teacher getUpdate(@RequestBody Teacher teacher,@PathVariable Long id)
    {
        teacher.setId(id);
        return teacherService.saveTeacher(teacher);
    }

}
