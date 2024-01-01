package com.zoo.zoo_app.dao;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Repository
public class HabitatDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
public int insertHabitat() {
    return this.jdbcTemplate.update("INSERT INTO habitat (HabitatID,Capacity,Habitat_Type) VALUES (1006,40,'void')");
}
    public List<Map<String, Object>> getHabitats() {
       return this.jdbcTemplate.queryForList("select * from habitat");
      

    }
    
}
