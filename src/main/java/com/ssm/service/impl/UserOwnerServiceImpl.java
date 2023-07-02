package com.ssm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssm.entity.UserOwner;
import com.ssm.service.UserOwnerService;
import com.ssm.mapper.UserOwnerMapper;
import org.springframework.stereotype.Service;

/**
* @author ColinCheem
* @description 针对表【user_owner(用户)】的数据库操作Service实现
* @createDate 2023-07-02 16:01:54
*/
@Service
public class UserOwnerServiceImpl extends ServiceImpl<UserOwnerMapper, UserOwner>
    implements UserOwnerService{

}




