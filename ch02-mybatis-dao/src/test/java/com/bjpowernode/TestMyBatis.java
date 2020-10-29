package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.dao.impl.StudentDaoImpl;
import com.bjpowernode.domain.Student;
import org.junit.Test;

import java.util.List;

public class TestMyBatis {

    @Test
    public void testSelectStudents(){
        StudentDao dao=new StudentDaoImpl();
        List<Student> studentList=dao.selectStudents();
        for(Student stu:studentList){
            System.out.println(stu);
        }
    }
    @Test
    public void testInsertStudent(){
        StudentDao dao=new StudentDaoImpl();
        Student student=new Student();
        student.setId(1005);
        student.setName("盾山");
        student.setAge(20);
        student.setEmail("dunshang@qq.com");
        int nums=dao.insertStudent(student);
        System.out.println("添加对象的数量："+nums);
    }
}
