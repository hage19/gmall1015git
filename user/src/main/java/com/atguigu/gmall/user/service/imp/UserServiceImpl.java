package com.atguigu.gmall.user.service.imp;

import com.atguigu.gmall.user.bean.UserInfo;
import com.atguigu.gmall.user.mapper.UserInfoMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther hage
 * @creat 2019-07-27 14:43
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> getAllUser() {
       List<UserInfo> userInfos = userInfoMapper.selectAllUser();

        return userInfos;
    }
}
