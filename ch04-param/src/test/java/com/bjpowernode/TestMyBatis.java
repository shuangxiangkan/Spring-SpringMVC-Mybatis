package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;

import com.bjpowernode.domain.Student;
import com.bjpowernode.utils.MyBatisUtils;
import com.bjpowernode.vo.QueryParam;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMyBatis {

    @Test
    public void testselectStudentById(){
        SqlSession sqlSession= MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student=dao.selectStudentById(1002);
        System.out.println("student="+student);
    }

    @Test
    public  void testSelectMultiParam(){
        SqlSession sqlSession=MyBatisUtils.getSqlSession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);

        List<Student> students = dao.selectMultiParam("李四", 20);
        for(Student stu:students){
            System.out.println("学生="+stu);
        }
        sqlSession.close();
    }

    @Test
    public  void testSelectMultiObject(){
        SqlSession sqlSession=MyBatisUtils.getSqlSession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);

        QueryParam param=new QueryParam();
        param.setParaName("张三");
        param.setParamAge(28);
        List<Student> students=dao.selectMultiObject(param);
        for(Student stu:students){
            System.out.println("学生="+stu);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectStudentIf(){
        SqlSession sqlSession=MyBatisUtils.getSqlSession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);

        QueryParam param=new QueryParam();
        param.setParaName("李四");
        param.setParamAge(18);
        List<Student> students=dao.selectMultiObject(param);
        for(Student stu:students){
            System.out.println("学生="+stu);
        }
        sqlSession.close();
    }
}
