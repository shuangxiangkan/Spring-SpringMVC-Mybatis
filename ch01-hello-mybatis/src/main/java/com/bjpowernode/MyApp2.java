package com.bjpowernode;

import com.bjpowernode.domain.Student;
import com.bjpowernode.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp2 {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession= MyBatisUtils.getSqlSession();
        String sqlId="com.bjpowernode.dao.StudentDao"+"."+"selectStudent";
        List<Student>  studentList = sqlSession.selectList(sqlId);
//        studentList.forEach(stu-> System.out.println(stu));
        for(Student stu:studentList){
            System.out.println("查询的学生："+stu);
        }
        sqlSession.close();
    }
}
