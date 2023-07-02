package com.ssm.service.impl;

import com.ssm.entity.UserRentEntity;
import com.ssm.mapper.UserRentMapper;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class UserServiceImpl implements UserService {
    @Resource
    private UserRentMapper userRentMapper;

    @Override
    public UserRentEntity selectByUserRentName(String rid) {
        return null;
    }
}
