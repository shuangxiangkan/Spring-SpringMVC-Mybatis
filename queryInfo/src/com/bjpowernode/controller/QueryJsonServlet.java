package com.bjpowernode.controller;

import com.bjpowernode.dao.ProvinceDao;
import com.bjpowernode.entity.Province;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class QueryJsonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //默认值，{}:表示json格式的数据
        String json="{}";
        //请求获取参数，省份的id
        String strProid=request.getParameter("proid");

        //判断proid有值时，调用dao查询数据
        if(strProid!=null&&strProid.trim().length()>0){
            ProvinceDao dao=new ProvinceDao();
            Province p=dao.queryProviceById(Integer.valueOf(strProid));
            //需要使用jackson把Province对象转为json
            ObjectMapper om=new ObjectMapper();
            json=om.writeValueAsString(p);

        }
        //把获取的数据，通过网络传给ajax中的异步对象，相应结果数据
        //指定服务器端（servlet）返回给浏览器的是json格式的数据
        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw=response.getWriter();
        pw.println(json);//输出数据--会付给ajax中responseText属性
        pw.flush();
        pw.close();
    }
}
