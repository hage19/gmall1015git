package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther hage
 * @creat 2019-07-27 14:42
 */


public interface UserService {


    List<UserInfo> getAllUser();
}
