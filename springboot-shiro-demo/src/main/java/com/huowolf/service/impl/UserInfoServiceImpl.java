package com.huowolf.service.impl;

/**
 * Created by huowolf on 2018/10/7.
 */
import com.huowolf.dao.UserInfoDao;
import com.huowolf.entity.UserInfo;
import com.huowolf.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}