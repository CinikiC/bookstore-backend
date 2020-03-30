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

@Controller
public class RegisterController {
    @Autowired
    UserService userservice;

    @CrossOrigin
    @PostMapping(value = "api/register")
    @ResponseBody
    public Result register(@RequestBody User requestUser) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        if(userservice.getByName(username)!=null) {
            return new Result(500);
        }

        try {
            userservice.add(requestUser);
        } catch (Exception e) {
            return new Result(300);
        }

        return new Result(200);
    }
}
