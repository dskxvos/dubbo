package com.sakura.dao;

import com.sakura.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> getAllUser();

}
