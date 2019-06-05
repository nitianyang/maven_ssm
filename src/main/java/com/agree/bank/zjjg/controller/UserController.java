package com.agree.bank.zjjg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/hello")
    public String helloword(String name){

        return name+"说了句你好springboot";
    }
}
