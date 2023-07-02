package com.ssm.service;

import com.ssm.entity.UserRentEntity;

public interface UserService {
    UserRentEntity selectByUserRentName(String rusername);
}
