package com.example.postgresconnection.repository;

import com.example.postgresconnection.domain.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
    //SELECT 1 FROM cities WHERE name = x
    City findCityByName(String name);
}
