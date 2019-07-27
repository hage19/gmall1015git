package com.atguigu.gmall.service;


import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

/**
 * @auther hage
 * @creat 2019-07-27 14:42
 */


public interface UserService {


    List<UserInfo> getAllUser();

    List<UserAddress> getAllAddress();

    List<UserInfo> AllUser();
}
