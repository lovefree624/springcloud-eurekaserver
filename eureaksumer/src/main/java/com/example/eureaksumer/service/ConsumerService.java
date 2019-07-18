/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  21:41
 */
package com.example.eureaksumer.service;

import com.example.springcloudcommon.entity.User;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/17 21:41
 */
public interface ConsumerService {

    User consumer(String name);
}
