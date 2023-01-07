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

    public static void main(String[] args) {
        ConfigurableApplicationContext appContext = SpringApplication.run(PostgresConnectionApplication.class, args);

        City innsbruck = new City();
        innsbruck.setName("Innsbruck");

        City imst = new City();
        imst.setName("Imst");
        imst.setCapital(false);

        City vienna = new City();
        vienna.setName("Vienna");
        vienna.setCapital(true);

        City linz = new City();
        linz.setName("Linz");
        linz.setCapital(true);

        City klagenfurt = new City();
        klagenfurt.setName("Klagenfurt");
        klagenfurt.setCapital(true);

        City stPolten = new City();
        stPolten.setName("St. Polten");
        stPolten.setCapital(true);

        City salzburg = new City();
        salzburg.setName("Salzburg");
        salzburg.setCapital(true);

        CityRepository cityRepository = appContext.getBean(CityRepository.class);
        cityRepository.save(innsbruck);
        cityRepository.save(imst);
        cityRepository.save(vienna);
        cityRepository.save(klagenfurt);
        cityRepository.save(linz);
        cityRepository.save(stPolten);
        cityRepository.save(salzburg);
    }

}
