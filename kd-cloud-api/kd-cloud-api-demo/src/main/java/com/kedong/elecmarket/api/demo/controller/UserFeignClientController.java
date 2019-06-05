package com.kedong.elecmarket.api.demo.controller;

import com.kedong.elecmarket.api.demo.FeignClient.KdCloudBusinessDemoClient;
import com.kedong.elecmarket.core.bean.entity.user.DemoUserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "用户信息查询服务")
@RestController
@RequestMapping("/demoFeignUser")
public class UserFeignClientController {

    private Logger logger = LoggerFactory.getLogger(UserFeignClientController.class);

    private final KdCloudBusinessDemoClient kdCloudBusinessDemoClient;

    public UserFeignClientController(KdCloudBusinessDemoClient kdCloudBusinessDemoClient) {
        this.kdCloudBusinessDemoClient = kdCloudBusinessDemoClient;
    }


    @ApiOperation(value = "详细信息查询", notes = "用于客户端查询用户详细信息", httpMethod = "GET")
    @GetMapping("/getUserInfoById/{userId}")
    public DemoUserInfo getUserInfoById(@PathVariable Integer userId) {
        logger.info("get user info");
        return this.kdCloudBusinessDemoClient.getUserInfoById(userId);
    }
}
