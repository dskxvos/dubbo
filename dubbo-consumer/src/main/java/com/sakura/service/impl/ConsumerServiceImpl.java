package com.sakura.service.impl;

import com.sakura.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("consumerService")
public class ConsumerServiceImpl implements com.sakura.service.ConsumerService {
    public List<User> getConsumerUser() {

        User user = new User();
        List<User> userList = new ArrayList<User>();
        user.setUserName("dad");
        userList.add(user);
        return userList;
    }
}
