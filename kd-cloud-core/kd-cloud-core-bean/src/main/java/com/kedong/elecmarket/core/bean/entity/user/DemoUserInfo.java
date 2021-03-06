package com.kedong.elecmarket.core.bean.entity.user;

import javax.persistence.*;

/**
 * @author 张庆贺
 * @since 2019/5/29 22:30
 */
@Table(name = "t_user_info")
public class DemoUserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    @Column(name = "user_id")
    private Integer userId;
    private String name = "张庆贺";
    private String company = "科东";

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
