package com.sakura.service.impl;

import com.sakura.dao.UserDao;
import com.sakura.entity.User;
import com.sakura.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public List<User> getAllUserMessage() {
        System.out.println("dada");
        return userDao.getAllUser();
    }
}
