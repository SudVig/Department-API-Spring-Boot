package com.example.psna.Service;

import com.example.psna.Entity.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);


    List<Department> fetchAllData();

    void delete(Long id);

    void updateDepartment(Department department);
}
