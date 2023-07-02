package com.ssm.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ssm.entity.UserRent;
import com.ssm.service.UserRentService;
import com.ssm.mapper.UserRentMapper;
import org.springframework.stereotype.Service;

import java.security.acl.Owner;

/**
* @author ColinCheem
* @description 针对表【user_rent(用户)】的数据库操作Service实现
* @createDate 2023-07-02 17:27:31
*/
@Service
public class UserRentServiceImpl extends ServiceImpl<UserRentMapper, UserRent>
implements UserRentService{



}
