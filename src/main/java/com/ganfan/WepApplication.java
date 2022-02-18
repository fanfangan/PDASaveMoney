package com.ganfan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ganfan.mapper")
public class WepApplication {

    public static void main(String[] args) {
        SpringApplication.run(WepApplication.class, args);
    }

}
