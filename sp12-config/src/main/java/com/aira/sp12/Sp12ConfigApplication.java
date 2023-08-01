package com.aira.sp12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class Sp12ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sp12ConfigApplication.class, args);
    }

}
