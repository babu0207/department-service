package com.example.learning.departmentservice.service;

import com.example.learning.departmentservice.entity.Department;
import com.example.learning.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long id) {
        return departmentRepository.findByDepartmentId(id);
    }
}
