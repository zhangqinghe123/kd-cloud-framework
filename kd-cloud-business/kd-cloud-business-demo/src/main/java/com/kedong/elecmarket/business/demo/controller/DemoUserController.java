package com.kedong.elecmarket.business.demo.controller;

import com.kedong.elecmarket.core.bean.entity.user.DemoUserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张庆贺getUserInfoById
 * @since 2019/5/30 11:38
 */
@RestController
@RequestMapping("/demoUser")
public class DemoUserController {

    @GetMapping("/getUserInfoById/{userId}")
    public DemoUserInfo getUserInfoById(@PathVariable Integer userId) {
        DemoUserInfo demoUserInfo = new DemoUserInfo();
        demoUserInfo.setUserId(userId);
        return demoUserInfo;
    }
}
