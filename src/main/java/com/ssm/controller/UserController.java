package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    //    登入方法
    @RequestMapping(value = "login", produces = "text/html;charset=UTF-8")
    String login(String username, String password) {
        username = "张三";
        password = "12345";

        return "false";
    }
}
