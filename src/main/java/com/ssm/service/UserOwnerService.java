package com.ssm.service;

import com.ssm.entity.UserOwner;
import com.baomidou.mybatisplus.service.IService;

/**
* @author ColinCheem
* @description 针对表【user_owner(用户)】的数据库操作Service
* @createDate 2023-07-02 17:27:27
*/
public interface UserOwnerService extends IService<UserOwner> {
    UserOwner findOne(UserOwner user);
    //用户注册
    int addOne(UserOwner user);
    UserOwner checkReg(String username);
}
