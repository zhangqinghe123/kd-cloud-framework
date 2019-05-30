package com.kedong.elecmarket.business.demo.web.controller;

import com.kedong.elecmarket.core.bean.entity.user.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张庆贺
 * @since 2019/5/30 11:38
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/info/{userId}")
    public UserInfo user(@PathVariable Integer userId) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        return userInfo;
    }
}
