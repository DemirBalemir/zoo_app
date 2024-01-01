package com.zoo.zoo_app.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.zoo.zoo_app.dao.HabitatDao;

@Service
public class HabitatService {
    @Autowired
    private HabitatDao habitatDao;

    public void fetchHabitat() {
        habitatDao.getHabitats();
    }
    public int insertHabitat() {
        return habitatDao.insertHabitat();
    }
}
