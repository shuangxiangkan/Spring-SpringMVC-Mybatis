package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;

import com.bjpowernode.domain.Student;
import com.bjpowernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMyBatis {

    @Test
    public void testSelectStudents(){
        SqlSession sqlSession= MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectStudents();
        for(Student stu:students){
            System.out.println("学生="+stu);
        }
    }

}
