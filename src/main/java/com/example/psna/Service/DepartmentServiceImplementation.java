package com.example.psna.Service;

import com.example.psna.Entity.Department;
import com.example.psna.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImplementation implements   DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchAllData() {
        return (List<Department>) departmentRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        departmentRepository.deleteById(id);


    }

    @Override
    public void updateDepartment(Department department) {
        departmentRepository.save(department);
    }
}
