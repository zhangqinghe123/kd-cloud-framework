package com.kedong.elecmarket.business.demo.mapper;


import com.kedong.elecmarket.business.demo.entity.DemoUserInfo;

import java.util.List;

/**
 * @author 张庆贺
 * @since 2019/6/13 17:42
 */
public interface UserInfoMapper {
    /**
     * 查询用户列表
     * @return
     */
    List<DemoUserInfo> findAllUser();
}
