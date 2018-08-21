/*
* Copyright (c)  2018
* All rights reserved.
* 2018-08-14 10:47:55
*/
package com.ueboot.shiro.service.user;

import com.ueboot.shiro.entity.User;
import com.ueboot.core.service.BaseService;

/**
 * Created on 2018-08-14 10:47:55
 * @author yangkui
 * @since 2.1.0 by ueboot-generator
 */
public interface UserService extends BaseService<User> {

    /**
     * 根据用户名和密码查找用户
     * @param userName 用户名
     * @param password 密码
     * @return 用户，不存在则返回空对象
     */
    User findByUserNameAndPassword(String userName,String password);
}