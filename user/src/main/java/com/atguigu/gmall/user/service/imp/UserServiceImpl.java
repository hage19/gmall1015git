package com.atguigu.gmall.user.service.imp;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.user.mapper.UserAddressMapper;
import com.atguigu.gmall.user.mapper.UserInfoMapper;
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
    @Autowired
    UserAddressMapper userAddressMapper;
    @Override
    public List<UserInfo> getAllUser() {
       List<UserInfo> userInfos = userInfoMapper.selectAllUser();

        return userInfos;
    }

    @Override
    public List<UserAddress> getAllAddress() {
        List<UserAddress> userAddresses = userAddressMapper.selectAll();
        return userAddresses;
    }

    @Override
    public List<UserInfo> AllUser() {
        return userInfoMapper.selectAll();
    }


}
