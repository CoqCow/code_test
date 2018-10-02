package com.example.demo.mapper.services;

import com.example.demo.mapper.dao.ICountryDao;
import com.example.demo.mapper.entities.Country;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ICountryDaoTest {
    @Autowired
    private ICountryDao iCountryDao;

    @Test
    public void testSelect() {
        Country country = iCountryDao.selectCountryById(1);
        System.out.println(country.toString());
    }
}
