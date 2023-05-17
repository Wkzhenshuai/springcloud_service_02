package com.sl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Pr_Application1 {

    public static void main(String[] args) {
        SpringApplication.run(Pr_Application1.class);
    }
}
