package com.tuyrk.reflect;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/18 14:51 星期一
 * Description:
 */
public class LoadDifference {
    public static void main(String[] args) throws ClassNotFoundException {
//        ClassLoader cl = Robot.class.getClassLoader();

        Class c = Class.forName("com.tuyrk.reflect.Robot");

        Class.forName("com.mysql.jdbc.Driver");
    }
}
