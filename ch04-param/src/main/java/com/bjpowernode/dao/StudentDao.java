package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;
import com.bjpowernode.vo.QueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    public Student selectStudentById(Integer id);

//    多个参数：命名参数
    List<Student> selectMultiParam(@Param("myname") String name,
                                   @Param("myage") Integer age);

    List<Student> selectMultiObject(QueryParam param);

    //动态sql，使用java对象作为参数
    List<Student> selectStudentIf(Student student);
}
