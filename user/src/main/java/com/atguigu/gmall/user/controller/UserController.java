package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @auther hage
 * @creat 2019-07-27 14:43
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;



    @RequestMapping("/addresses")
    @ResponseBody
    public List<UserAddress> getAllAddresses(){
        List<UserAddress> userAddress = userService.getAllAddress();
        return userAddress;
    }


    @RequestMapping("/users")
    @ResponseBody
    public List<UserInfo> getAllUsers(){
        List<UserInfo> userInfos = userService.getAllUser();
        return userInfos;
    }

    @RequestMapping("/allusers")
    @ResponseBody
    public List<UserInfo> AllUsers(){
        List<UserInfo> userInfos = userService.AllUser();
        return userInfos;
    }
}
