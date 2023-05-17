package com.sl.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//BeanConfig 相当于application.xml

@Configuration
public class BeanConfig {

    @Bean
    @LoadBalanced
   public RestTemplate restTemplate(){
       return new RestTemplate();
   }


    @Bean
    @LoadBalanced
    public IRule iRule(){
        return new RandomRule();
    }

}
