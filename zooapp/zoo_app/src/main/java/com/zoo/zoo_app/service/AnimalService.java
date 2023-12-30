package com.zoo.zoo_app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.zoo_app.dao.AnimalDao;


@Service
public class AnimalService {
    @Autowired
    private AnimalDao animalDao;

    public void fetchMaleanimal() {
        animalDao.readMaleAnimalfromDB();
    }
    public void fetchFemaleanimal() {
        animalDao.readFemaleAnimalfromDB();
    }
}
