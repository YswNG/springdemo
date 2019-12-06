package com.ysw.springdemo.controller;

import com.ysw.springdemo.po.User;
import com.ysw.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private UserService userService;

    /**
     * 最简单的请求示例
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "home";
    }

    /**
     * get 请求参数 并跳转至 home view
     * @param user
     * @return
     */
    @RequestMapping(value = "/showUserInfo",method = RequestMethod.GET)
    public String userInfo(User user){
        return "home";
    }

    /**
     * 返回 user对象数据
     * @return
     */
    @RequestMapping(value = "showData",method = RequestMethod.GET)
    @ResponseBody
    public User userJsonData(){
        User user = new User();
        user.setUsername("3");
        user.setAge(2);
        return user;
    }

    /**
     * 查询数据库
     * @return
     */
    @RequestMapping("selectUsers")
    @ResponseBody
    public List<User> selectUsers(){
        return userService.queryUsers();
    }
}
