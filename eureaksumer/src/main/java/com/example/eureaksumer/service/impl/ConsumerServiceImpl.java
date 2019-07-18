/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  21:42
 */
package com.example.eureaksumer.service.impl;

import com.example.eureaksumer.service.ConsumerService;
import com.example.springcloudcommon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/17 21:42
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public User consumer(String id) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/getOne?id="+id, User.class);
    }
}
