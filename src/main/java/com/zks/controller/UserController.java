package com.zks.controller;

import com.zks.model.MyResult;
import com.zks.model.User;
import com.zks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping(value = "/login")
    public MyResult login(@RequestBody User user) {
        return userService.login(user);
    }


}
