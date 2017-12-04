package com.xingfu.springboot.web;

import com.xingfu.springboot.domain.User;
import com.xingfu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 *
 * @author: zisong.wang
 * @Date: 2017/12/2
 */
@RestController
@RequestMapping("/demo")
@EnableAutoConfiguration
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("hello")
    public String Hello(){
        return "hello spring boot!";
    }

    @RequestMapping("queryUserList")
    public List<User> queryUserList(@RequestParam String Id){
        return userService.queryUserList(Integer.parseInt(Id));
    }

}
