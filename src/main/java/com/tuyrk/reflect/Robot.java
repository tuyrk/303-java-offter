package com.tuyrk.reflect;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/14 13:42 星期四
 * Description:
 */
public class Robot {
    private String name;

    public void sayHi(String helloSentence) {
        System.out.println(helloSentence + " " + name);
    }

    private String throwHello(String tag) {
        return "Hello " + tag;
    }

    static {
        System.out.println("Hello Robot");
    }
}
