package com.sl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka_Application8001 {

    public static void main(String[] args) {
        SpringApplication.run(Eureka_Application8001.class);
    }
}
