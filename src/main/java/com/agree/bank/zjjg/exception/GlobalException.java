package com.agree.bank.zjjg.exception;

//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 第一种:通过@Configration &  实现HandlerExceptionResolver
 * 第二种:通过@ControllerAdvice  &  @ExceptionHandler
 */
//@Configuration
@ControllerAdvice
public class GlobalException {
//    @Override
//    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
//        ModelAndView mv = new ModelAndView();
//        //可以通过 instanceof 来判断异常并进入错误界面
//        mv.addObject("error",e.toString());
//        return mv;
//    }


    @ResponseBody
    @ExceptionHandler(value = java.lang.Exception.class)
    public Map<String, Object> myException(){
        Map map = new HashMap();
        map.put("msg","出错了") ;

        return map;
    }
}
