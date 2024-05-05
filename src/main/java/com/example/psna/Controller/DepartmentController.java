package com.example.psna.Controller;

import com.example.psna.Entity.Department;
import com.example.psna.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchAll() {
        return departmentService.fetchAllData();
    }

    @DeleteMapping("/departments/{id}")
    public void delete(@PathVariable("id") Long id) {
        departmentService.delete(id);
    }


    @PutMapping("/departments")
    public void update(@RequestBody Department department)
    {
        departmentService.updateDepartment(department);
    }
}