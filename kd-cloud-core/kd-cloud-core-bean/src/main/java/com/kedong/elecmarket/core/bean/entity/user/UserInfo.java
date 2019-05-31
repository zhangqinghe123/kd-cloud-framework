package com.kedong.elecmarket.core.bean.entity.user;

/**
 * @author 张庆贺
 * @since 2019/5/29 22:30
 */
public class UserInfo {
    private Integer id;
    private String name = "张庆贺";
    private String company = "科东";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
