package com.santana.mobilab.server.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {
		"com.santana.mobilab.server.repository",
		"com.santana.socialnetwork.repository"
		})
@EnableAutoConfiguration
@EntityScan(basePackages = {
		"com.santana.mobilab.server.model",
		"com.santana.socialnetwork.model"
		})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
    }
}