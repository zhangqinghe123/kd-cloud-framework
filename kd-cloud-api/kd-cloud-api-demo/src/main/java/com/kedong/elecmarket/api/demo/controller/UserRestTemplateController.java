package com.kedong.elecmarket.api.demo.controller;

import com.kedong.elecmarket.core.bean.entity.user.DemoUserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 张庆贺
 * @since 2019/5/28 15:50
 */
@Api(value = "用户信息查询服务")
@RestController
@RequestMapping("/demoRestUser")
public class UserRestTemplateController {

    private Logger logger = LoggerFactory.getLogger(UserRestTemplateController.class);

    private final RestTemplate restTemplate;
    private final LoadBalancerClient loadBalancerClient;

    public UserRestTemplateController(RestTemplate restTemplate, LoadBalancerClient loadBalancerClient) {
        this.restTemplate = restTemplate;
        this.loadBalancerClient = loadBalancerClient;
    }

    @ApiOperation(value = "详细信息查询", notes = "用于客户端查询用户详细信息", httpMethod = "GET")
    @GetMapping("/getUserInfoById/{userId}")
    public DemoUserInfo getUserInfoById(@PathVariable Integer userId) {
        // http://localhost:8080/demoRestUser/getUserInfoById/1234562323
        logger.info("get user info");
        return this.restTemplate.getForObject("http://kd-cloud-business-demo/demoUser/getUserInfoById/" + userId, DemoUserInfo.class);
    }
}
