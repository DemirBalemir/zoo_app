package com.zoo.zoo_app.dao;
import org.springframework.stereotype.Repository;

import com.zoo.zoo_app.model.Habitat;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Repository
public class HabitatDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int insertHabitat(Habitat habitat) {
        return this.jdbcTemplate.update(
            "INSERT INTO habitat (HabitatID, Capacity, Habitat_Type) VALUES (?, ?, ?)",
            habitat.getHabitatID(), habitat.getCapacity(), habitat.getHabitat_Type()
        );
    }
    public int deleteHabitat(int HabitatID) {
        return this.jdbcTemplate.update(
            "DELETE FROM habitat WHERE HabitatID = ?",
            HabitatID
        );
    }
    public List<Map<String, Object>> getHabitats() {
       return this.jdbcTemplate.queryForList("select * from habitat");
      

    }
    
}
