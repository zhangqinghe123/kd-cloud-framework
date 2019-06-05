package com.kedong.elecmarket.api.demo.FeignClient;

import com.kedong.elecmarket.core.bean.entity.user.DemoUserInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 张庆贺
 * @since 2019/6/5 9:36
 */
@FeignClient(name = "kd-cloud-business-demo")
public interface KdCloudBusinessDemoClient {

    @GetMapping(value = "/demoUser/getUserInfoById/{userId}")
    DemoUserInfo getUserInfoById(@PathVariable("userId") Integer userId);

}
