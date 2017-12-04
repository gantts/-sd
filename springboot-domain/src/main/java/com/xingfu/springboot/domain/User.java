package com.xingfu.springboot.domain;

import lombok.Data;
import lombok.experimental.Accessors;
/**
 * @author  zisong.wang
 */
@Data
@Accessors(chain = true)
public class User {

    private String username;

    private String password;

    private Integer age;

}
