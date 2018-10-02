package com.example.demo.mapper.dao;


import com.example.demo.mapper.entities.Employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;


@Component
public interface EmployeeDao extends Mapper<Employee> {

   Employee selectByName(@Param("empName") String empName);
}
