package com.tuyrk.jvm.model;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/18 21:22 星期一
 * Description:
 */
public class HelloWorld {
    private String name;

    public void sayHello() {
        System.out.println("Hello " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        int a = 1;
        HelloWorld hw = new HelloWorld();
        hw.setName("test");
        hw.sayHello();
    }
}
