package com.zoo.zoo_app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zoo.zoo_app.dao.HabitatDao;

import java.util.List;
import java.util.Map;

@RestController
public class HabitatController {
    @Autowired
    private HabitatDao habitatDao;

@PostMapping("/api/habitats/insert")
public int insertHabitat() {
    return habitatDao.insertHabitat();
}

    @GetMapping("/api/habitats")
    public List<Map<String, Object>> getHabitats() {
        return habitatDao.getHabitats();
    }

    
}
