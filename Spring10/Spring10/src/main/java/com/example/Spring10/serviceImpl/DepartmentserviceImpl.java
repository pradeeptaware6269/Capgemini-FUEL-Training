package com.example.Spring10.serviceImpl;

import com.example.Spring10.Repository.DepartmentRepo;
import com.example.Spring10.model.Department;
import com.example.Spring10.service.DapertmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentserviceImpl implements DapertmentService {
    @Autowired
    private DepartmentRepo departmentRepo;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public Department getDepartment(Long id) {
        return departmentRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepo.deleteById(id);
    }
}
