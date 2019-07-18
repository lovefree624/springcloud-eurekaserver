package com.example.eurekaclient2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("com.example.eurekaclient2.mapper")
public class Eurekaclient2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaclient2Application.class, args);
    }

}
