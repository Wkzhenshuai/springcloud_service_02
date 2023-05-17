package com.sl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Pr_Application2 {

    public static void main(String[] args) {
        SpringApplication.run(Pr_Application2.class);
    }
}
