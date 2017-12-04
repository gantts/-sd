package com.xingfu.springboot;

import com.xingfu.springboot.domain.User;
import com.xingfu.springboot.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.util.List;

/**
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 *
 * @author: zisong.wang
 * @Date: 2017/12/1
 */
@SpringBootApplication(scanBasePackages = "com.xingfu.springboot")
@MapperScan("com.xingfu.springboot.dao.mapper*")
@ImportResource(locations = {"classpath:application-bean.xml"})
@ServletComponentScan
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
