package com.tuyrk.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/14 13:44 星期四
 * Description:
 */
public class ReflectSample {
    public static void main(String[] args) throws Exception {
        Class<?> rc = Class.forName("com.tuyrk.reflect.Robot");
        Robot robot = (Robot) rc.newInstance();
        System.out.println("Class name is " + rc.getName());

        //private私有方法
        Method getHello = rc.getDeclaredMethod("throwHello", String.class);//可以获取所有(包括私有方法)自定义的方法，不能获取继承或者实现接口的方法
        getHello.setAccessible(true);//throwHello方法为私有方法，默认为false
        Object str = getHello.invoke(robot, "Bob");
        System.out.println("getHello result is " + str);

        //public公有方法
        Method sayHi = rc.getMethod("sayHi", String.class);//只能获取public方法，但是可以获取继承或接口的方法
        sayHi.invoke(robot, "Welcome");

        //私有属性
        Field name = rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(robot, "Alice");
        sayHi.invoke(robot, "Welcome");
    }
}
