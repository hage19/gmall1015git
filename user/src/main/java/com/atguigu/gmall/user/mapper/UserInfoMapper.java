package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @auther hage
 * @creat 2019-07-27 14:22
 */
public interface UserInfoMapper extends Mapper<UserInfo>{
    List<UserInfo> selectAllUser();


}
