package com.agree.bank.zjjg.controller;

import com.agree.bank.zjjg.pojo.Users;
import com.agree.bank.zjjg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String helloword(Integer id){
        System.out.println(id+"===============================");
        System.out.println(userService.selectById(id));
        return "test";
    }

    /**
     * 跳转进入登录界面
     * @return
     */
    @RequestMapping("/index")
    public  String index(){
        return "login";
    }

    /**
     * 提供表单校验功能
     * @param users
     * @param bindingResult
     * @param request
     * @return
     */
    @RequestMapping("/valid")
    public String valid(@Valid  Users users , BindingResult bindingResult , HttpServletRequest request){

        if(!bindingResult.hasErrors()){
           System.out.println("校验成功");
//           进入系统界面
            return "userView";
        }
        List <FieldError>list =bindingResult.getFieldErrors();
        Map <String ,Object >map = new HashMap<>();

        for(int i=0;i<list.size();i++ ){
            map.put(list.get(i).getField(),list.get(i).getDefaultMessage());
        }
        request.setAttribute("err",map);
//        校验失败返回请求界面并提示错误.....
        return "login";
    }
}
