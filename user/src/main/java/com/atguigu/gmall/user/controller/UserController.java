package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UserInfo;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther hage
 * @creat 2019-07-27 14:43
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/users")
    @ResponseBody
    public List<UserInfo> getAllUsers(){
        List<UserInfo> userInfos = userService.getAllUser();
        return userInfos;
    }
}
