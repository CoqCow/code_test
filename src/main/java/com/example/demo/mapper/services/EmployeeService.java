package com.example.demo.mapper.services;

import com.example.demo.mapper.entities.Employee;
import com.example.demo.mapper.mappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee getEmployeeByEmpId(Integer empId) {
        Employee employeeQueryAdition = new Employee(empId, null, null, null);
        List<Employee> res =  employeeMapper.selectAll();

        return res.get(0);
    }
}
