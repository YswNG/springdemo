package com.ysw.springdemo.service.impl;

import com.ysw.springdemo.dao.UserMapper;
import com.ysw.springdemo.po.User;
import com.ysw.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUsers() {
        return userMapper.queryUsers();
    }
}
