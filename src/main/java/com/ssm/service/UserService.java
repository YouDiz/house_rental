package com.ssm.service;

import com.ssm.entity.UserRentEntity;
/**
 *   @anther  mt
 *   @creater 2020-08-15 9:24
 */
public interface UserService {
    UserRentEntity selectByUserRentName(String rusername);
}
