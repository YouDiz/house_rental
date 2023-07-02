package com.ssm.mapper;

import com.ssm.entity.UserOwner;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ssm.entity.UserRent;

/**
* @author ColinCheem
* @description 针对表【user_owner(用户)】的数据库操作Mapper
* @createDate 2023-07-02 16:01:54
* @Entity com.ssm.entity.UserOwner
*/
public interface UserOwnerMapper extends BaseMapper<UserOwner> {
    UserOwner findOne(UserOwner user);
    //用户注册
    int addOne(UserOwner user);
    UserOwner checkReg(String username);
}




