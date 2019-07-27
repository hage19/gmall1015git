package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UserInfo;

import java.util.List;

/**
 * @auther hage
 * @creat 2019-07-27 14:22
 */
public interface UserInfoMapper {
    List<UserInfo> selectAllUser();
}
