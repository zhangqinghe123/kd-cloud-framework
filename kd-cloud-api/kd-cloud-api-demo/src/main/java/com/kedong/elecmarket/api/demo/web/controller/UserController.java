package com.kedong.elecmarket.api.demo.web.controller;

import com.kedong.elecmarket.api.demo.domain.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张庆贺
 * @since 2019/5/28 15:50
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/info")
    public UserInfo user() {
        return new UserInfo();
    }
}
