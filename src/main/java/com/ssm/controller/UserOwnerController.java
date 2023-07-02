package com.ssm.controller;

import com.ssm.entity.UserOwner;
import com.ssm.service.UserOwnerService;
import com.ssm.service.UserOwnerService;
import org.codehaus.jackson.map.Module;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserOwnerController {
    @Resource
    private UserOwnerService userService;

    //    登入方法
    @RequestMapping(value = "login", produces = "text/html;charset=UTF-8")
    String login(UserOwner user, Model model) {
        UserOwner u = userService.findOne(user);
        model.addAttribute("user", u);
        if (u != null) {
            return "登陆成功";
        } else
            return "登陆失败";

    }
    //注册
    @RequestMapping(value = "register", produces = "text/html;charset=UTF-8")
    public String reg(UserOwner user) {
        UserOwner u = userService.checkReg(user.getOname());
        if (u == null) {
            userService.addOne(user);
            return "成功注册";
        }
        return "注册失败";
    }

}
