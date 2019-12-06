package com.ysw.springdemo.dao;

import com.ysw.springdemo.po.User;

import java.util.List;


public interface UserMapper {
    List<User> queryUsers();
}
