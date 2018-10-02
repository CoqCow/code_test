package com.example.demo.mapper.mappers;


import com.example.demo.mapper.entities.Employee;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface EmployeeMapper extends Mapper<Employee> {

}
