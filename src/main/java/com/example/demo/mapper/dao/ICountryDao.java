package com.example.demo.mapper.dao;

import com.example.demo.mapper.entities.Country;
import org.springframework.stereotype.Component;

@Component
public interface ICountryDao {
    Country selectCountryById(Integer cid);
}
