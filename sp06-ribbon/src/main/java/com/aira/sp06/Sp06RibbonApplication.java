package com.aira.sp06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class Sp06RibbonApplication {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        SimpleClientHttpRequestFactory f = new SimpleClientHttpRequestFactory();
        f.setConnectTimeout(1000);
        f.setReadTimeout(1000);
        return new RestTemplate(f);
    }
    public static void main(String[] args) {
        SpringApplication.run(Sp06RibbonApplication.class, args);
    }

}
