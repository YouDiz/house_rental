package com.ssm.mapper;

import com.ssm.entity.UserRentEntity;

public interface UserRentMapper {
    UserRentEntity selectByUserRentName(String rid);
}
