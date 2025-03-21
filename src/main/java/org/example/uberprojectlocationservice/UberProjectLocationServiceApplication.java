package org.example.uberprojectlocationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
public class UberProjectLocationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UberProjectLocationServiceApplication.class, args);
    }

}
