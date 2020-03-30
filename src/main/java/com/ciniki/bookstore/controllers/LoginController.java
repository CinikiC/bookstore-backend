package com.ciniki.bookstore.controllers;

//响应码类和用户类
import com.ciniki.bookstore.result.Result;
import com.ciniki.bookstore.pojo.User;
import com.ciniki.bookstore.services.UserService;

//Spring 框架组件
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

//使用 Spring 框架控制器原型
@RestController
public class LoginController {
    @Autowired
    UserService userservice;

    @CrossOrigin                            //允许跨域
    @PostMapping(value = "/api/login")      //和前端发起 POST 动作的 API 地址一致
    public User login(@RequestBody User requestUser) throws Exception {    //前端通过 axios 用 POST 传来的数据作为请求来源，视为一个 User 对象
                                                            //Spring 会按照 json 格式对号入座为 User 对象的两个成员赋值
        String username = requestUser.getUsername();        //获取用户名
        username = HtmlUtils.htmlEscape(username);          //转义 HTML 标签防止 XSS 攻击

        //核验用户名和密码
        User user = userservice.getByNameAndPassword(username, requestUser.getPassword());
        return user;
    }
}
