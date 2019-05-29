package com.kedong.elecmarket.ribbon.web.controller;

import com.kedong.elecmarket.core.bean.entity.user.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 张庆贺
 * @since 2019/5/29 20:56
 */
@RestController
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/info/{userId}")
    public UserInfo user(@PathVariable Integer userId) {
        logger.info("ribbon get user info");
        return this.restTemplate.getForObject("http://kd-cloud-api-demo/user/info/" + userId, UserInfo.class);
    }
}
