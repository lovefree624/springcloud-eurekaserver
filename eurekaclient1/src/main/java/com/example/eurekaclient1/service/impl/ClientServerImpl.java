/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  22:03
 */
package com.example.eurekaclient1.service.impl;

import com.example.eurekaclient1.mapper.ClientMapper;
import com.example.eurekaclient1.service.ClientServer;
import com.example.springcloudcommon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/17 22:03
 */
@Service
public class ClientServerImpl implements ClientServer {
    @Autowired
    ClientMapper clientMapper;
    @Override
    public User getOne(String id) {
        return clientMapper.getOne(id);
    }
}
