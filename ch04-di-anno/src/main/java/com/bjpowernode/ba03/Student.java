package com.bjpowernode.ba03;


import org.springframework.beans.factory.annotation.Autowired;
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

    @Value(value = "李四")
    private String name;
    @Value(value = "29")
    private Integer age;

//    引用类型
//    @Autowired: spring框架提供的注解，实现引用类型的赋值
//    spring中通过注解给应用类型赋值，使用的是自动注入原理，支持byName,byte
//    @Autowired:默认使用的是byType自动注入

    @Autowired
    private School school;

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
                ", school=" + school +
                '}';
    }
}
