/*
 * Copyright (c) 2018 New Hope Group. All rights reserved.
 * Project: nhdc-cloud-psi-service
 * FileName: C.java
 * Author: panwensheng
 * Date:  21:59
 */
package com.example.springcloudcommon.entity;

import lombok.Data;

import java.io.PipedReader;

/**
 * @author panwensheng
 * @version 1.0.0
 * @description
 * @date 2019/7/17 21:59
 */
@Data
public class User {

    private int id;

    private String name;

    private String sex;

    private String dataNum;
}
