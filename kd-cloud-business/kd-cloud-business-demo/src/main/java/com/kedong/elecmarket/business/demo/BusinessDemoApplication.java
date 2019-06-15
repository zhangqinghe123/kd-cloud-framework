package com.kedong.elecmarket.business.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;


/**
 * @author 张庆贺
 * @since 2019/5/30 11:46
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.kedong.elecmarket.business.demo.mapper")
public class BusinessDemoApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BusinessDemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BusinessDemoApplication.class, args);
    }
}
