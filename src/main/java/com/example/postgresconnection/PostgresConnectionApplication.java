package com.example.postgresconnection;

import com.example.postgresconnection.domain.City;
import com.example.postgresconnection.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PostgresConnectionApplication {

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
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext appContext = SpringApplication.run(PostgresConnectionApplication.class, args);

        City innsbruck = new City();
        innsbruck.setName("Innsbruck");
        innsbruck.setCapital(false);

        City vienna = new City();
        vienna.setName("Vienna");
        vienna.setCapital(true);

        City linz = new City();
        linz.setName("Linz");
        linz.setCapital(false);

        City klagenfurt = new City();
        klagenfurt.setName("Klagenfurt");
        klagenfurt.setCapital(false);

        City stPolten = new City();
        stPolten.setName("St. Polten");
        stPolten.setCapital(false);

        CityRepository cityRepository = appContext.getBean(CityRepository.class);
        cityRepository.save(innsbruck);
        cityRepository.save(vienna);
        cityRepository.save(klagenfurt);
        cityRepository.save(linz);
        cityRepository.save(stPolten);

    }

}
