package com.zoo.zoo_app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zoo.zoo_app.dao.HabitatDao;
import com.zoo.zoo_app.model.Habitat;

import java.util.List;
import java.util.Map;

@RestController
public class HabitatController {
    @Autowired
    private HabitatDao habitatDao;
@PostMapping("/api/habitats/insert")
public int insertHabitat(@RequestBody Habitat habitat) {
    return habitatDao.insertHabitat(habitat);
}
@DeleteMapping("/api/habitats/delete/{HabitatID}")
public int deleteHabitat(@PathVariable int HabitatID) {
    return habitatDao.deleteHabitat(HabitatID);
}

    @GetMapping("/api/habitats")
    public List<Map<String, Object>> getHabitats() {
        return habitatDao.getHabitats();
    }

    
}
