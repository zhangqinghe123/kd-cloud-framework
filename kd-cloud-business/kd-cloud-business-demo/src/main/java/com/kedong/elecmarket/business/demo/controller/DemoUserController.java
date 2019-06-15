package com.kedong.elecmarket.business.demo.controller;

import com.kedong.elecmarket.business.demo.mapper.UserInfoMapper;
import com.kedong.elecmarket.core.bean.entity.user.DemoUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 张庆贺getUserInfoById
 * @since 2019/5/30 11:38
 */
@RestController
@RequestMapping("/demoUser")
public class DemoUserController {

    @Autowired
    private UserInfoMapper userInfoMapper;


    @GetMapping("/getUserInfoById/{userId}")
    public List<DemoUserInfo> getUserInfoById(@PathVariable Integer userId) {
        return userInfoMapper.findAllUser();
    }
}
