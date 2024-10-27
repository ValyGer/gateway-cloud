package ru.gerasimov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientTwoApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientTwoApp.class, args);
    }
}