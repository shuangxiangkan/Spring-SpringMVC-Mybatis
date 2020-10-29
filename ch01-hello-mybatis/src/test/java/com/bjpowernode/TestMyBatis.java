package com.bjpowernode;

import com.bjpowernode.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis {
    //测试方法，测试功能
    @Test
    public void testInsert() throws IOException {
        String config="mybatis.xml";
        InputStream in= Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
//        SqlSession sqlSession = factory.openSession();
        SqlSession sqlSession = factory.openSession(true);
        String sqlId="com.bjpowernode.dao.StudentDao"+"."+"insertStudent";
        Student student=new Student();
        student.setId(1006);
        student.setName("关羽");
        student.setEmail("guanyu@163.com");
        student.setAge(20);
        int nums=sqlSession.insert(sqlId,student);
        //mybatis默认不是自动提交事务的，所以在inset,update,delete后要手动提交事务
//        sqlSession.commit();
        System.out.println("执行insert的结果:"+nums);
        sqlSession.close();
    }
}
