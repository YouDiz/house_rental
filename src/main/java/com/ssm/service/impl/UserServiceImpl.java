package com.ssm.service.impl;

import com.ssm.entity.UserRentEntity;
import com.ssm.mapper.UserRentMapper;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 *   @anther  mt
 *   @creater 2020-08-15 9:24
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRentMapper userRentMapper;

    @Override
    public UserRentEntity selectByUserRentName(String rname) {
        return userRentMapper.selectByUserRentName(rname);
    }
}
