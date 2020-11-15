package com.webflux.security.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories
public class WebfluxSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebfluxSecurityApplication.class, args);
    }

}
