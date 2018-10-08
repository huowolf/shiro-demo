package com.huowolf.service

import com.huowolf.entity.UserInfo

/**
 * Created by huowolf on 2018/10/7.
 */
public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}