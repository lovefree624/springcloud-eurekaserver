/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  21:58
 */
package com.example.eurekaclient3.controller;

import com.example.eurekaclient3.service.ClientServer;
import com.example.springcloudcommon.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/17 21:58
 */
@RestController
public class ClientController {

    @Resource
    ClientServer clientServer;

    @RequestMapping(value = "/getOne",method = RequestMethod.GET)
    public User getOne(@RequestParam String id){
      return  clientServer.getOne(id);
    }
}
