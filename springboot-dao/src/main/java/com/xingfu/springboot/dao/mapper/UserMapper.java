package com.xingfu.springboot.dao.mapper;

import com.xingfu.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zisong.wang
 */
public interface UserMapper {

    List<User> queryUserByCondition(@Param("uname") String userName, String userPwd);

    List<User> queryUserList(@Param("Id") Integer Id);

}
