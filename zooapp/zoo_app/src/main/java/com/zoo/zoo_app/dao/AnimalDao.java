package com.zoo.zoo_app.dao;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Repository
public class AnimalDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Map<String, Object>> readMaleAnimalfromDB() {
       return this.jdbcTemplate.queryForList("select * from animal where Animal_Gender='Male'");
      

    }
    @Autowired
    public List<Map<String, Object>> readFemaleAnimalfromDB() {
       return this.jdbcTemplate.queryForList("select * from animal where Animal_Gender='Female'");
      

    }

    
    public List<Map<String, Object>> getAnimalStats() {
      String sql = "SELECT animal.HabitatID, COUNT(*) as AnimalCount, AVG(animal.is_sick) as AverageSicknessRate " +
                   "FROM animal " +
                   "JOIN nutrition ON animal.NutritionID = nutrition.NutritionID " +
                   "JOIN nutrition_supplier ON animal.SupplierID = nutrition_supplier.SupplierID " +
                   "GROUP BY animal.HabitatID";
      return jdbcTemplate.queryForList(sql);
  }
}
    