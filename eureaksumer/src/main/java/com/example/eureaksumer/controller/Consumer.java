/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  21:39
 */
package com.example.eureaksumer.controller;

import com.example.eureaksumer.service.ConsumerService;
import com.example.springcloudcommon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/17 21:39
 */
@RestController
public class Consumer {

    @Autowired
    private ConsumerService consumerService;

    @PostMapping(value = "/consumer")
    public User consumer(@RequestParam String name){
        return consumerService.consumer(name);
    }

}
