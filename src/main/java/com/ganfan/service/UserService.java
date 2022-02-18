package com.ganfan.service;

import com.ganfan.mapper.UserMapper;
import com.ganfan.pojo.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @作者 ganfan
 * @时间 2022/2/17
 * @包名 ganfanAndroidApi
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public LoginUser GetUser(String Phone){
        return  userMapper.GetUser(Phone);
    }
}
