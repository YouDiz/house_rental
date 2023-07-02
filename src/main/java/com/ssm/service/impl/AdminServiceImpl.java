package com.ssm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssm.entity.Admin;
import com.ssm.service.AdminService;
import com.ssm.mapper.AdminMapper;
import org.springframework.stereotype.Service;

/**
* @author ColinCheem
* @description 针对表【admin(用户表)】的数据库操作Service实现
* @createDate 2023-07-02 16:01:31
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
    implements AdminService{

}




