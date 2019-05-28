package com.kedong.elecmarket.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server 中心
 * @author 张庆贺
 * @since 2019/5/28 12:24
 */
@EnableEurekaServer
@SpringBootApplication
public class KdEurekaApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(KdEurekaApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(KdEurekaApplication.class, args);
    }
}
