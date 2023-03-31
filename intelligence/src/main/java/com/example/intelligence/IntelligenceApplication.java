package com.example.intelligence;


import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@SpringBootApplication
@EnableScheduling
public class IntelligenceApplication {
    public static void main(String[] args) {
        SpringApplication.run(IntelligenceApplication.class, args);
    }




}
