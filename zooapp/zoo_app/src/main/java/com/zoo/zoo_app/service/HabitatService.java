package com.zoo.zoo_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.zoo_app.dao.HabitatDao;

@Service
public class HabitatService {
    @Autowired
    private HabitatDao habitatDao;

    public void fetchHabitat() {
        habitatDao.readHabitatfromDB();
    }
}
