package com.example.demo.mapper.services;

import com.example.demo.mapper.entities.Employee;
import com.example.demo.mapper.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSelectByPrimeryKey() {
        Employee employee = employeeService.getEmployeeByEmpId(4);
        System.out.println(employee.toString());
    }

    @Test
    public void testSelectEmployees() {
        List<Employee> list = employeeService.getEmpLoyees(new Employee(null, "bob", null, 30));
        for (Employee employee : list) {
            System.out.println(employee.toString());
        }
    }

    @Test
    public void testInsert() {
        Employee employee = new Employee(7, null, 100d, null);
        //employeeMapper.insert(employee);
        //employeeMapper.insertSelective(employee);
        //employeeMapper.updateByPrimaryKeySelective(employee);
        employeeDao.deleteByPrimaryKey(7);
        System.out.println(employee.getEmpId());
    }

    @Test
    public void testCriteria() {
        Example example = new Example(Employee.class);
        Example.Criteria criteria = example.createCriteria();
        Example.Criteria criteria2 = example.createCriteria();
        criteria.andGreaterThanOrEqualTo("empId", 3).andLessThanOrEqualTo("empId", 5);
        criteria2.andEqualTo("empSalary", 1254.37);

        example.or(criteria2);
        example.orderBy("empId").desc();
        example.selectProperties("empId");

        List<Employee> employees = employeeDao.selectByExample(example);

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

    }

    @Test
    public void testXmlSelect(){
      Employee employee=  employeeDao.selectByName("bob");
        System.out.println(employee.toString());
    }
}