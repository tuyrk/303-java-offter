package com.tuyrk.jvm.model;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/19 21:05 星期二
 * Description:
 */
public class InternDifference {
    public static void main(String[] args) {
        String s = new String("a");
        s.intern();
        String s2 = "a";
        System.out.println(s == s2);//比较字符串的地址

        String s3 = new String("a") + new String("a");
        s3.intern();
        String s4 = "aa";
        System.out.println(s3 == s4);
    }
}
