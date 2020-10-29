package com.bjpowernode.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//创建处理器对象，对象凡在springmvc容器中
@Controller
public class Mycontroller {

//    逐个接收请求参数
//    要求：处理器（控制器）方法的形参名和请求中的参数名必须一致
//    同名的请求参数赋值给同名的形参
    @RequestMapping(value = "/receiveproperty.do")
    public ModelAndView doSome(String name,int age){//doGet()--service请求处理
        //处理some.do请求了，向导鱼service调用处理完成了
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;


    }

}
