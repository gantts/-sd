package com.xingfu.springboot.service.impl;

import com.xingfu.springboot.dao.mapper.UserMapper;
import com.xingfu.springboot.domain.User;
import com.xingfu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 *
 * @author: zisong.wang
 * @Date: 2017/12/4
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList(Integer Id) {
        return userMapper.queryUserList(Id);
    }

    
}
