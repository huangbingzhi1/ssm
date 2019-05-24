package com.hisense.ssm.users.controller;

import com.hisense.ssm.users.entity.BaseUser;
import com.hisense.ssm.users.mapper.BaseUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Huang.bingzhi
 * @Date: 2019/5/23 21:09
 * @Version 1.0
 */
@RestController
@RequestMapping("/userController")
public class UserController {
    @Autowired
    private BaseUserMapper baseUserMapper;

    @RequestMapping("getAllUsers")
    public List<BaseUser> getAllUsers(){
        List<BaseUser> baseUsers = baseUserMapper.selectAll();
        return baseUsers;
    }
}
