package com.sakura.controller;

import com.alibaba.fastjson.JSON;
import com.sakura.entity.User;
import com.sakura.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getAllUserMessage")
    public String getAllUserMessage(){
        return JSON.toJSONString(userService.getAllUserMessage());
    }

}
