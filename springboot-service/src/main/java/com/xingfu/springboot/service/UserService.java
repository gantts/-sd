package com.xingfu.springboot.service;

import com.xingfu.springboot.dao.mapper.UserMapper;
import com.xingfu.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 *  @author zisong.wang
 */
@Service
public interface UserService {

    List<User> queryUserList(Integer Id);

}
