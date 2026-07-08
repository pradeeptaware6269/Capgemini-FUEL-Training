package com.example.Spring10.service;

import com.example.Spring10.model.Department;

public interface DapertmentService {

    Department saveDepartment(Department department);
    Department getDepartment(Long id);
    void deleteDepartment(Long id);
}
