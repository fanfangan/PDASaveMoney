package com.ganfan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @作者 ganfan
 * @时间 2022/2/17
 * @包名 ganfanAndroidApi
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginUser {
    private  int id;
    private String userName;
    private  String passWord;
    private String realName;
    private  String Phone;
}
