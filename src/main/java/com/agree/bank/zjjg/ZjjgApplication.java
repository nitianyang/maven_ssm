package com.agree.bank.zjjg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("com.agree.bank.zjjg.dao.UserDao")
@EnableCaching
@SpringBootApplication
public class ZjjgApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZjjgApplication.class, args);
    }

}
