package com.bjpowernode.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//创建处理器对象，对象凡在springmvc容器中
@Controller
public class mycontroller {

    /**
     * 准备使用doSome方法处理some.do请求
     * @RequestMapping:请求映射，作用是把一个请求地址和一个方法绑定在一起
     *                  一个请求指定一个方法
     *                  属性：1.value是
     * @return
     */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){//doGet()--service请求处理
        //处理some.do请求了，向导鱼service调用处理完成了
        ModelAndView mv=new ModelAndView();
        //添加数据
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doSome方法");

        //指定视图，指定视图的完整路径
        //框架对视图执行的forward操作
        //mv.setViewName("/show.jsp");
        //mv.setViewName("/WEB-INF/view/show.jsp");

        //当配置了视图解析器后，可以使用逻辑名称（文件名），指定视图
        //框架会使用视图解析器的前缀+逻辑名称+后缀 组成完整路径，这里就是字符串连接
        mv.setViewName("show");


        //返回mv
        return mv;


    }

    @RequestMapping(value = {"/other.do","/second.do"})
    public ModelAndView doOther(){//doGet()--service请求处理
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doOther方法");

        mv.setViewName("other");


        //返回mv
        return mv;


    }
}
