package com.sakura.entity;

import java.io.Serializable;

/**
 * 使用dobbo暴露服务传输的数据模型需要实现序列化的接口（数据传输需要）
 */
public class User implements Serializable {


    private long userId;

    private String userName;

    private String password;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
