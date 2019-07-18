package com.example.eureaksumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class EureaksumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EureaksumerApplication.class, args);
    }

}
