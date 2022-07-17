package com.gx.admin.service;

import com.gx.admin.bean.City;
import com.gx.admin.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface CityService {

    City getById(Long id);

    void saveCity(City city);

}

