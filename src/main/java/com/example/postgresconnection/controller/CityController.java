package com.example.postgresconnection.controller;

import com.example.postgresconnection.domain.City;
import com.example.postgresconnection.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController{
    @Autowired
    CityRepository cityRepository;

    @GetMapping("/innsbruck")
    public City innsbruck(){
        return cityRepository.findCityByName("Innsbruck");
    }

    @GetMapping("/vienna")
    public City vienna(){
        return cityRepository.findCityByName("Vienna");
    }

    @GetMapping("/imst")
    public City imst(){
        return cityRepository.findCityByName("Imst");
    }


}
