package com.santana.mobilab.server.run;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.santana.mobilab.server.model.Vehicle;
import com.santana.mobilab.server.repository.VehicleRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.santana.mobilab.server.repository")
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.santana.mobilab.server.model"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
    }
}