package com.kedong.elecmarket.api.demo.web.controller;

import com.kedong.elecmarket.core.bean.entity.user.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张庆贺
 * @since 2019/5/28 15:50
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/info/{userId}")
    public UserInfo user(@PathVariable Integer userId) {
        logger.info("get user info");
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        return userInfo;
    }
}
