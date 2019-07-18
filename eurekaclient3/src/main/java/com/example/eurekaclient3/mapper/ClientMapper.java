package com.example.eurekaclient3.mapper;

import com.example.springcloudcommon.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClientMapper {

    User getOne(String id);
}
