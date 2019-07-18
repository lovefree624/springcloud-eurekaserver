package com.example.eurekaclient1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("com.example.eurekaclient1.mapper")
public class Eurekaclient1Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaclient1Application.class, args);
    }

}
