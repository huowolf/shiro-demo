package com.huowolf.dao;

/**
 * Created by huowolf on 2018/10/7.
 */
import com.huowolf.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}