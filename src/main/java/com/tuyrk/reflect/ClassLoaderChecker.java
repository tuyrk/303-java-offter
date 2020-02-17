package com.tuyrk.reflect;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/14 15:02 星期四
 * Description:
 */
public class ClassLoaderChecker {
    public static void main(String[] args) throws Exception {
        MyClassLoader m = new MyClassLoader("E:\\java\\imooc_coding\\303-java-offter\\src\\main\\resources\\", "Wali");
        Class c = m.loadClass("Wali");
        System.out.println("1. " + c.getClassLoader());
        System.out.println("2. " + c.getClassLoader().getParent());
        System.out.println("3. " + c.getClassLoader().getParent().getParent());
        c.newInstance();
    }
}
