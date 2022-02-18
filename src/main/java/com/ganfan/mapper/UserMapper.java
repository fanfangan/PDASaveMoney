package com.ganfan.mapper;

import com.ganfan.pojo.LoginUser;
import org.springframework.stereotype.Repository;

/**
 * @作者 ganfan
 * @时间 2022/2/17
 * @包名 ganfanAndroidApi
 */
@Repository
public interface UserMapper {
    LoginUser GetUser(String Phone);
}
