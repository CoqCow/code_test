package com.example.demo.mapper.services;

import com.example.demo.mapper.entities.Employee;
import com.example.demo.mapper.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public Employee getEmployeeByEmpId(Integer empId) {

        return employeeDao.selectByPrimaryKey(empId);
    }

    public List<Employee> getEmpLoyees(Employee employee) {

        return employeeDao.select(employee);
    }
}
