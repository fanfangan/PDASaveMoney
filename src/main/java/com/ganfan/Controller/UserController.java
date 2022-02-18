package com.ganfan.Controller;

import com.ganfan.pojo.LoginUser;
import com.ganfan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 ganfan
 * @时间 2022/2/17
 * @包名 ganfanAndroidApi
 */
@RestController
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{Phone}")
    public LoginUser GetUser(@PathVariable String Phone){
        System.out.println("ss");
        return userService.GetUser(Phone);
    }
}
