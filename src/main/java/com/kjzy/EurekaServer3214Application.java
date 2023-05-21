package com.kjzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer3214Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer3214Application.class, args);
    }

}
