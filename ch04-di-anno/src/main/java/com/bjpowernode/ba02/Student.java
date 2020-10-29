package com.bjpowernode.ba02;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
@Component：创建对象的，等同于<bean>的功能
属性：value就是对象的名称，也就是bean的id值
    value的值是唯一的，创建的对象在整个spring容器中就一个
位置：在类的上面


@Component(value = "myStudent")等同于
<bean id="myStudent" class ="com.bjpowernode.ba01.Student"/>
 **/

//@Component(value = "myStudent")
@Component
public class Student {

    @Value(value = "张飞")
    private String name;
    @Value(value = "29")
    private Integer age;

    public Student() {
        System.out.println("==student无参构造方法===");
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
