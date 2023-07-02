package com.ssm.controller;

import com.ssm.entity.UserRentEntity;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    //    登入方法
    @RequestMapping(value = "login", produces = "text/html;charset=UTF-8")
    String login(String username, String password) {
        username = "张三";
        UserRentEntity userRentEntity = userService.selectByUserRentName(username);
        if (userRentEntity.getRpwd().equals(password)) {
            return "success";
        }
        return "false";
    }
}
